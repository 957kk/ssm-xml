package com.zxk.ssm.xml.service.impl;

import com.zxk.ssm.xml.dao.ScoreDao;
import com.zxk.ssm.xml.dao.UserBehaviorLogDao;
import com.zxk.ssm.xml.dao.UserDao;
import com.zxk.ssm.xml.enums.BehaviorType;
import com.zxk.ssm.xml.enums.ResultCodeEnum;
import com.zxk.ssm.xml.model.dto.UserDTO;
import com.zxk.ssm.xml.model.handler.UserMapper;
import com.zxk.ssm.xml.model.po.Score;
import com.zxk.ssm.xml.model.po.User;
import com.zxk.ssm.xml.model.po.UserBehaviorLog;
import com.zxk.ssm.xml.model.result.ResponseResult;
import com.zxk.ssm.xml.service.UserService;
import com.zxk.ssm.xml.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @program: ssm-xml
 * @description:
 * @author: xkZhao
 * @Create: 2021-09-14 22:53
 **/
@Service
public class UserServiceImpl implements UserService {
    /**
     * 默认积分
     */
    public static final Integer DEFAULT_USER_REGISTER_SCORE = 100;

    @Autowired
    private UserDao userDao;
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private UserBehaviorLogDao userBehaviorLogDao;

    /**
     * 注册业务
     *
     * @param dto
     * @return
     */
    @Override
    public ResponseResult register(UserDTO dto) {

        if (StringUtils.isEmpty(dto)) {
            return ResponseResult.error(ResultCodeEnum.USER_INFO_IS_INVALID);
        }
        if (StringUtils.isEmpty(dto.getName())) {
            return ResponseResult.error(ResultCodeEnum.USER_INFO_NAME_IS_BLANK);
        }
        if (StringUtils.isEmpty(dto.getPassword())) {
            return ResponseResult.error(ResultCodeEnum.USER_INFO_PASSWORD_IS_BLANK);
        }

        if (!StringUtils.isEmpty(userDao.selectUserByName(dto.getName()))) {
            return ResponseResult.error(ResultCodeEnum.USER_INFO_NAME_IS_EXIST);
        }
        User user = UserMapper.iNSTANCE.userDTO2User(dto);

        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setNickName("nini");
        String randomSalt = MD5Utils.getRandomSalt();
        // 对密码 加密
        String encodePassword = MD5Utils.generateMd5(user.getPassword(), randomSalt);
        user.setPassword(encodePassword);

        // 对盐 base64 编码
        String saltBase64Encode = MD5Utils.saltBase64Encode(randomSalt);
        user.setSalt(saltBase64Encode);
        userDao.insertUser(user);

        Score score = new Score();
        score.setCreateTime(new Date());
        score.setScore(DEFAULT_USER_REGISTER_SCORE);
        score.setUpdateTime(new Date());
        score.setUserId(user.getId());

        scoreDao.insertScore(score);

        UserBehaviorLog userBehaviorLog = new UserBehaviorLog();
        userBehaviorLog.setHandleTime(new Date());
        userBehaviorLog.setUserId(user.getId());
        userBehaviorLog.setType(BehaviorType.REGISTER_BEHAVIOR.getType());
        userBehaviorLog.setBehavior(BehaviorType.REGISTER_BEHAVIOR.getDesc());

        userBehaviorLogDao.insertUserBehaviorLog(userBehaviorLog);

        return ResponseResult.ok();
    }
}

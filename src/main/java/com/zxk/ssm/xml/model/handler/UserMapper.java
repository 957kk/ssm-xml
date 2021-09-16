package com.zxk.ssm.xml.model.handler;

import com.zxk.ssm.xml.model.dto.UserDTO;
import com.zxk.ssm.xml.model.po.User;
import com.zxk.ssm.xml.model.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @program: ssm-xml
 * @description: mapstruct
 * @author: xkZhao
 * @Create: 2021-09-15 14:50
 **/
@Mapper
public interface UserMapper {
    UserMapper iNSTANCE = Mappers.getMapper(UserMapper.class);

    User userDTO2User(UserDTO userDTO);

    UserDTO userVO2UserDTO(UserVO userVO);


}

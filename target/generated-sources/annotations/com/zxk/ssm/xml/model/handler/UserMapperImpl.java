package com.zxk.ssm.xml.model.handler;

import com.zxk.ssm.xml.model.dto.UserDTO;
import com.zxk.ssm.xml.model.po.User;
import com.zxk.ssm.xml.model.vo.UserVO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-16T23:38:14+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userDTO2User(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setName( userDTO.getName() );
        user.setPassword( userDTO.getPassword() );

        return user;
    }

    @Override
    public UserDTO userVO2UserDTO(UserVO userVO) {
        if ( userVO == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( userVO.getName() );
        userDTO.setPassword( userVO.getPassword() );

        return userDTO;
    }
}

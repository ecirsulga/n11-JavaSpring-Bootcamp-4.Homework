package com.ecirsulga.homework5.n11bootcamp.usr.converter;

import com.ecirsulga.homework5.n11bootcamp.usr.dto.UsrUserDto;
import com.ecirsulga.homework5.n11bootcamp.usr.dto.UsrUserSaveRequestDto;
import com.ecirsulga.homework5.n11bootcamp.usr.entity.UsrUser;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T21:39:44+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class UsrUserMapperImpl implements UsrUserMapper {

    @Override
    public UsrUserDto convertToUsrUserDtoList(UsrUser usrUser) {
        if ( usrUser == null ) {
            return null;
        }

        UsrUserDto usrUserDto = new UsrUserDto();

        usrUserDto.setId( usrUser.getId() );
        usrUserDto.setName( usrUser.getName() );
        usrUserDto.setUsername( usrUser.getUsername() );
        usrUserDto.setPassword( usrUser.getPassword() );

        return usrUserDto;
    }

    @Override
    public List<UsrUserDto> convertToUsrUserDtoList(List<UsrUser> usrUserList) {
        if ( usrUserList == null ) {
            return null;
        }

        List<UsrUserDto> list = new ArrayList<UsrUserDto>( usrUserList.size() );
        for ( UsrUser usrUser : usrUserList ) {
            list.add( convertToUsrUserDtoList( usrUser ) );
        }

        return list;
    }

    @Override
    public UsrUser convertToUsrUserSaveRequestDto(UsrUserSaveRequestDto usrUserSaveRequestDto) {
        if ( usrUserSaveRequestDto == null ) {
            return null;
        }

        UsrUser usrUser = new UsrUser();

        usrUser.setId( usrUserSaveRequestDto.getId() );
        usrUser.setName( usrUserSaveRequestDto.getName() );
        usrUser.setUsername( usrUserSaveRequestDto.getUsername() );
        usrUser.setPassword( usrUserSaveRequestDto.getPassword() );

        return usrUser;
    }

    @Override
    public UsrUserSaveRequestDto convertToSaveRequestDtoUsrUser(UsrUser usrUser) {
        if ( usrUser == null ) {
            return null;
        }

        UsrUserSaveRequestDto usrUserSaveRequestDto = new UsrUserSaveRequestDto();

        usrUserSaveRequestDto.setId( usrUser.getId() );
        usrUserSaveRequestDto.setName( usrUser.getName() );
        usrUserSaveRequestDto.setUsername( usrUser.getUsername() );
        usrUserSaveRequestDto.setPassword( usrUser.getPassword() );

        return usrUserSaveRequestDto;
    }
}

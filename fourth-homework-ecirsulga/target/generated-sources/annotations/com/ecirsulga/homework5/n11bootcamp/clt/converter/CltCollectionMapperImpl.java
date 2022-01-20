package com.ecirsulga.homework5.n11bootcamp.clt.converter;

import com.ecirsulga.homework5.n11bootcamp.clt.dto.CltCollectionSaveRequestDto;
import com.ecirsulga.homework5.n11bootcamp.clt.entity.CltCollection;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-19T21:26:45+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class CltCollectionMapperImpl implements CltCollectionMapper {

    @Override
    public CltCollection convertToCltCollectionSaveRequestDto(CltCollectionSaveRequestDto cltCollectionSaveRequestDto) {
        if ( cltCollectionSaveRequestDto == null ) {
            return null;
        }

        CltCollection cltCollection = new CltCollection();

        cltCollection.setCollectedAmount( cltCollectionSaveRequestDto.getCollectedAmount() );
        cltCollection.setCollectedDate( cltCollectionSaveRequestDto.getCollectedDate() );
        cltCollection.setDbtDebtId( cltCollectionSaveRequestDto.getDbtDebtId() );
        cltCollection.setUsrUserId( cltCollectionSaveRequestDto.getUsrUserId() );

        return cltCollection;
    }
}

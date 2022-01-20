package com.ecirsulga.homework5.n11bootcamp.dbt.converter;

import com.ecirsulga.homework5.n11bootcamp.dbt.dto.DbtDebtSaveRequestDto;
import com.ecirsulga.homework5.n11bootcamp.dbt.entity.DbtDebt;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T22:45:57+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.4 (JetBrains s.r.o)"
)
public class DbtDebtMapperImpl implements DbtDebtMapper {

    @Override
    public DbtDebt convertToDbtDebtSaveRequestDto(DbtDebtSaveRequestDto dbtDebtSaveRequestDto) {
        if ( dbtDebtSaveRequestDto == null ) {
            return null;
        }

        DbtDebt dbtDebt = new DbtDebt();

        dbtDebt.setId( dbtDebtSaveRequestDto.getId() );
        dbtDebt.setMainDebt( dbtDebtSaveRequestDto.getMainDebt() );
        dbtDebt.setRemainingDebt( dbtDebtSaveRequestDto.getRemainingDebt() );
        dbtDebt.setDebtType( dbtDebtSaveRequestDto.getDebtType() );
        dbtDebt.setMainDebtId( dbtDebtSaveRequestDto.getMainDebtId() );
        dbtDebt.setExpireDate( dbtDebtSaveRequestDto.getExpireDate() );
        dbtDebt.setUpdateDate( dbtDebtSaveRequestDto.getUpdateDate() );
        dbtDebt.setLateFee( dbtDebtSaveRequestDto.getLateFee() );
        dbtDebt.setUsrUserId( dbtDebtSaveRequestDto.getUsrUserId() );

        return dbtDebt;
    }
}

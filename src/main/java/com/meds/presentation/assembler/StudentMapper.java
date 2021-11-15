package com.meds.presentation.assembler;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.presentation.vo.StudentInfoVo;
import com.meds.presentation.vo.StudentRegisterVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface StudentMapper {
    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    StudentRegisterDto toStudentRegisterDto(StudentRegisterVo requestVo);

    StudentInfoVo toStudentInfoVo(StudentInfoDto studentInfoDto);
}

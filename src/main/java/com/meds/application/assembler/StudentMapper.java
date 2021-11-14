package com.meds.application.assembler;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface StudentMapper {

    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    StudentRegisterDo toStudentRegisterDo(StudentRegisterDto registerDo);

    StudentInfoDto toStudentInfoDto(StudentInfoDo studentInfoDo);
}

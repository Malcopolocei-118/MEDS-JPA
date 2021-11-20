package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.infrastructure.entity.StudentInfoPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface StudentMapper {
    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    StudentInfoPo toStudentRegisterDo(StudentRegisterDo registerDo);

    StudentInfoDo toStudentInfoDo(StudentInfoPo studentInfoPo);

    StudentInfoPo toStudentInfoPo(StudentInfoDo studentInfoDo);
}

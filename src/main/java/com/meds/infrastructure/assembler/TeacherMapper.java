package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class, SubjectEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);

    TeacherInfoPo toTeacherInfoPo(TeacherRegisterDo registerDo);

    TeacherInfoDo toTeacherInfoDo(TeacherInfoPo teacherInfoPo);
}

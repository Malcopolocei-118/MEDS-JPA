package com.meds.application.assembler;

import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);

    TeacherRegisterDo toTeacherRegisterDo(TeacherRegisterDto requestDto);

    TeacherInfoDto toTeacherInfoDto(TeacherInfoDo teacherInfoDo);
}

package com.meds.presentation.assembler;

import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.presentation.vo.TeacherInfoVo;
import com.meds.presentation.vo.TeacherRegisterVo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class, SubjectEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface TeacherMapper {

    TeacherMapper MAPPER = Mappers.getMapper(TeacherMapper.class);

    TeacherRegisterDto toTeacherRegisterDto(TeacherRegisterVo requestVo);

    TeacherInfoVo toTeacherInfoVo(TeacherInfoDto teacherInfoDto);
}

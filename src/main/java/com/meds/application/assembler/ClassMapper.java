package com.meds.application.assembler;

import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface ClassMapper {

    ClassMapper MAPPER = Mappers.getMapper(ClassMapper.class);

    ClassRegisterDo toClassRegisterDo(ClassRegisterDto classRegisterDto);

    ClassInfoDto toClassInfoDto(ClassInfoDo classInfoDo);
}

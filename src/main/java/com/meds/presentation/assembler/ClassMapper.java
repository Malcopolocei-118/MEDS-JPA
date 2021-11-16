package com.meds.presentation.assembler;

import com.meds.common.ClassLevelEnum;
import com.meds.common.GenderEnum;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {ClassLevelEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface ClassMapper {
    ClassMapper MAPPER = Mappers.getMapper(ClassMapper.class);
}

package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface ClassMapper {

    ClassMapper MAPPER = Mappers.getMapper(ClassMapper.class);

}

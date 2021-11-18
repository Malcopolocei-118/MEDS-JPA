package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.infrastructure.entity.ClassInfoPo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {GenderEnum.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
@SuppressWarnings("squid:S1214")
public interface ClassMapper {

    ClassMapper MAPPER = Mappers.getMapper(ClassMapper.class);

    ClassInfoPo toClassInfoPo(ClassRegisterDo classRegisterDo);

    ClassInfoDo toClassInfoDo(ClassInfoPo classInfoPo);

    ClassInfoPo toClassInfoPo(ClassInfoDo classInfoDo);
}

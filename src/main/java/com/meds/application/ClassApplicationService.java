package com.meds.application;

import com.meds.application.assembler.ClassMapper;
import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.domain.classInfo.service.ClassDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassApplicationService {

    private final ClassDomainService classDomainService;

    public void saveClassInfo(ClassRegisterDto classRegisterDto) {
        ClassRegisterDo classRegisterDo = ClassMapper.MAPPER.toClassRegisterDo(classRegisterDto);
        classDomainService.saveClassInfo(classRegisterDo);
    }

    public ClassInfoDto findClassById(Long id) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(id);
        return ClassMapper.MAPPER.toClassInfoDto(classInfoDo);
    }
}

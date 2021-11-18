package com.meds.domain.classInfo.service;

import com.meds.application.dto.ClassRegisterDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.infrastructure.repository.ClassRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassDomainService {

    private final ClassRepository classRepository;

    public void saveClassInfo(ClassRegisterDo classRegisterDo) {
        classRepository.saveClassInfo(classRegisterDo);
    }

    public ClassInfoDo findClassById(Long id) {
        //返回在这里处理
        return classRepository.findClassById(id);
    }

    public void save(ClassInfoDo classInfoDo) {
        classRepository.save(classInfoDo);
    }
}

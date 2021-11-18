package com.meds.infrastructure.repository;

import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;

public interface ClassRepository {

    void saveClassInfo(ClassRegisterDo classRegisterDo);

    ClassInfoDo findClassById(Long id);
}

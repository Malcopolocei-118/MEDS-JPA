package com.meds.infrastructure.repository;

import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import org.springframework.stereotype.Repository;

public interface ClassRepository {

    void saveClassInfo(ClassRegisterDo classRegisterDo);

    ClassInfoDo findClassById(Long id);

    void save(ClassInfoDo classInfoDo);

    void deleteClassById(Long classId);

    ClassInfoDo findClassByClassId(String classId);
}

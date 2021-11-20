package com.meds.infrastructure.repository;

import com.meds.infrastructure.entity.ClassInfoPo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaClassRepository extends JpaRepository<ClassInfoPo, Long> {

    ClassInfoPo findByClassId(String classId);
}

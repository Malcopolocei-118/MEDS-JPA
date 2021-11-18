package com.meds.infrastructure.repository;

import com.meds.infrastructure.entity.StudentInfoPo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaStudentRepository extends JpaRepository<StudentInfoPo, Long> {

    List<StudentInfoPo> findAllByGrouped(Boolean isToClass);

}

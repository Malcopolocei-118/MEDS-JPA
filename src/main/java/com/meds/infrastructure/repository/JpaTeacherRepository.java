package com.meds.infrastructure.repository;

import com.meds.infrastructure.entity.TeacherInfoPo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTeacherRepository extends JpaRepository<TeacherInfoPo, Long> {

    List<TeacherInfoPo> findAllByGrouped(boolean isToClass);

}

package com.meds.infrastructure.repository;

import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import java.util.List;

public interface TeacherRepository {

    void saveTeacher(TeacherRegisterDo teacherRegisterDo);

    void deleteById(Long id);

    List<TeacherInfoDo> findAllUngrouping(boolean isToClass);
}

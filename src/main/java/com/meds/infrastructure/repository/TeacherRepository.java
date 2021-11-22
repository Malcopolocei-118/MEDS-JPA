package com.meds.infrastructure.repository;

import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.entity.TeacherRegisterDo;
import java.util.List;
import org.springframework.stereotype.Repository;

public interface TeacherRepository {

    void saveTeacher(TeacherRegisterDo teacherRegisterDo);

    void deleteById(Long id);

    List<TeacherInfoDo> findAllUngrouping(boolean isToClass);

    TeacherInfoDo findTeacherById(Long id);

    void saveTeacherInfo(TeacherInfoDo teacherInfoDo);

    List<TeacherInfoDo> findAll();

    void saveAll(List<TeacherInfoDo> teacherInfoDos);
}

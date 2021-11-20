package com.meds.infrastructure.repository;

import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.presentation.vo.StudentInfoVo;
import java.util.List;

public interface StudentRepository {

    void saveStudent(StudentRegisterDo requestDo);

    void deleteById(Long studentId);

    List<StudentInfoDo> findAllUngrouping(Boolean isToClass);

    StudentInfoDo findStudentById(Long id);

    void saveStudentInfo(StudentInfoDo studentInfoDo);

    List<StudentInfoDo> findAll();

    void saveAll(List<StudentInfoDo> studentInfoDos);
}

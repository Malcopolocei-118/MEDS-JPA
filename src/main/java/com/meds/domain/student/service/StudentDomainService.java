package com.meds.domain.student.service;

import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.infrastructure.repository.StudentRepository;
import com.meds.presentation.vo.StudentInfoVo;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentDomainService {

    private final StudentRepository studentRepository;

    public void saveStudent(StudentRegisterDo registerDo) {
        studentRepository.saveStudent(registerDo);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public List<StudentInfoDo> findAllUngrouping() {
       return studentRepository.findAllUngrouping(false);
    }

    public StudentInfoDo findStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }
}

package com.meds.domain.student.service;

import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import com.meds.infrastructure.repository.TeacherRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TeacherDomainService {

    private TeacherRepository teacherRepository;

    public void saveTeacher(TeacherRegisterDo registerDo) {
        teacherRepository.saveTeacher(registerDo);
    }


    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }

    public List<TeacherInfoDo> findAllUngrouping() {
        return teacherRepository.findAllUngrouping(false);
    }
}

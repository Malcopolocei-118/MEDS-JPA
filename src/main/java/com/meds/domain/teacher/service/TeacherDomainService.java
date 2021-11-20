package com.meds.domain.teacher.service;

import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.entity.TeacherRegisterDo;
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

    public TeacherInfoDo findTeacherById(Long id) {
        return teacherRepository.findTeacherById(id);
    }

    public void saveTeacherInfo(TeacherInfoDo teacherInfoDo) {
        teacherRepository.saveTeacherInfo(teacherInfoDo);
    }

    public List<TeacherInfoDo> findAll() {
        return teacherRepository.findAll();
    }

    public void saveAll(List<TeacherInfoDo> teacherInfoDos) {
        teacherRepository.saveAll(teacherInfoDos);
    }
}

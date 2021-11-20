package com.meds.application;

import com.meds.application.assembler.TeacherMapper;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.service.ClassDomainService;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.entity.TeacherRegisterDo;
import com.meds.domain.teacher.service.TeacherDomainService;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeacherApplicationService {

    private final TeacherDomainService teacherDomainService;

    private final ClassDomainService classDomainService;

    public void saveTeacher(TeacherRegisterDto requestDto) {
        TeacherRegisterDo registerDo = TeacherMapper.MAPPER.toTeacherRegisterDo(requestDto);
        registerDo.setTeacherId(UUID.randomUUID().toString());
        teacherDomainService.saveTeacher(registerDo);
    }

    public void deleteTeacherById(Long id) {
        TeacherInfoDo teacherInfoDo = teacherDomainService.findTeacherById(id);
        if (Optional.ofNullable(teacherInfoDo.getClassId()).isPresent()) {
            ClassInfoDo classInfoDo = classDomainService.findClassByClassId(teacherInfoDo.getClassId());
            classInfoDo.setStudentSize(classInfoDo.getTeacherSize() - 1);
            classDomainService.save(classInfoDo);
        }
        teacherDomainService.deleteTeacherById(id);
    }

    public List<TeacherInfoDto> findAllUngrouping() {
        List<TeacherInfoDo> teacherInfoDos = teacherDomainService.findAllUngrouping();
        return teacherInfoDos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoDto)
                .collect(Collectors.toList());
    }

    public TeacherInfoDto findTeacherById(Long id) {
        TeacherInfoDo teacherInfoDo = teacherDomainService.findTeacherById(id);
        return TeacherMapper.MAPPER.toTeacherInfoDo(teacherInfoDo);
    }

}

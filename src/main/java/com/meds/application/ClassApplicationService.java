package com.meds.application;

import com.meds.application.assembler.ClassMapper;
import com.meds.application.assembler.StudentMapper;
import com.meds.application.assembler.TeacherMapper;
import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.domain.classInfo.service.ClassDomainService;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.student.service.StudentDomainService;
import com.meds.domain.teacher.service.TeacherDomainService;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassApplicationService {

    private final ClassDomainService classDomainService;

    private final StudentDomainService studentDomainService;

    private final TeacherDomainService teacherDomainService;

    public void saveClassInfo(ClassRegisterDto classRegisterDto) {
        ClassRegisterDo classRegisterDo = ClassMapper.MAPPER.toClassRegisterDo(classRegisterDto);
        classRegisterDo.setClassId(UUID.randomUUID().toString());
        classDomainService.saveClassInfo(classRegisterDo);
    }

    public ClassInfoDto findClassById(Long id) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(id);
        return ClassMapper.MAPPER.toClassInfoDto(classInfoDo);
    }

    public void groupStudentByClassId(Long classId, Long studentId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        StudentInfoDo studentInfoDo = studentDomainService.findStudentById(studentId);
        studentInfoDo.setClassId(classInfoDo.getClassId());
        studentInfoDo.setClassName(classInfoDo.getClassName());
        studentInfoDo.setGrouped(true);

        classInfoDo.setStudentSize(classInfoDo.getStudentSize() + 1);
        classDomainService.save(classInfoDo);
        studentDomainService.saveStudentInfo(studentInfoDo);
    }

    public void groupTeacherByClassId(Long classId, Long teacherId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        TeacherInfoDo teacherInfoDo = teacherDomainService.findTeacherById(teacherId);
        teacherInfoDo.setClassId(classInfoDo.getClassId());
        teacherInfoDo.setClassName(classInfoDo.getClassName());
        teacherInfoDo.setGrouped(true);
        classInfoDo.setTeacherSize(classInfoDo.getTeacherSize() + 1);

        classDomainService.save(classInfoDo);
        teacherDomainService.saveTeacherInfo(teacherInfoDo);
    }

    public void removeStudentById(Long classId, Long studentId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        StudentInfoDo studentInfoDo = studentDomainService.findStudentById(studentId);
//        if (!studentInfoDo.getClassId().equals(classInfoDo.getClassId())) {
//            throw new IllegalArgumentException();
//        }
        studentInfoDo.setClassId(null);
        studentInfoDo.setClassName(null);
        studentInfoDo.setGrouped(false);
        classInfoDo.setStudentSize(classInfoDo.getStudentSize() - 1);

        classDomainService.save(classInfoDo);
        studentDomainService.saveStudentInfo(studentInfoDo);
    }

    public void removeTeacherById(Long classId, Long teacherId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        TeacherInfoDo teacherInfoDo = teacherDomainService.findTeacherById(teacherId);
//        if (!teacherInfoDo.getClassId().equals(classInfoDo.getClassId())) {
//             throw new IllegalArgumentException();
//        }
        teacherInfoDo.setClassId(null);
        teacherInfoDo.setClassName(null);
        teacherInfoDo.setGrouped(false);
        classInfoDo.setTeacherSize(classInfoDo.getTeacherSize() - 1);

        classDomainService.save(classInfoDo);
        teacherDomainService.saveTeacherInfo(teacherInfoDo);
    }

    public void deleteClassById(Long classId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        List<StudentInfoDo> studentInfoDos = studentDomainService.findAll().stream()
                .filter(item -> Objects.equals(item.getClassId(), classInfoDo.getClassId()))
                .collect(Collectors.toList());
        List<TeacherInfoDo> teacherInfoDos = teacherDomainService.findAll().stream()
                .filter(item -> Objects.equals(item.getClassId(), classInfoDo.getClassId()))
                .collect(Collectors.toList());
        classDomainService.deleteClassById(classId);
        studentInfoDos.stream()
                .peek(it -> it.setClassId(null))
                .peek(it -> it.setClassName(null))
                .peek(it -> it.setGrouped(false))
                .collect(Collectors.toList());
        teacherInfoDos.stream()
                .peek(it -> it.setClassId(null))
                .peek(it -> it.setClassName(null))
                .peek(it -> it.setGrouped(false))
                .collect(Collectors.toList());
        studentDomainService.saveAll(studentInfoDos);
        teacherDomainService.saveAll(teacherInfoDos);
    }

    public ClassInfoDto getClassDetailById(Long classTrueId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classTrueId);
        List<StudentInfoDo> studentInfoDos = studentDomainService.findAll();
        List<TeacherInfoDo> teacherInfoDos = teacherDomainService.findAll();
        List<StudentInfoDto> studentInfoDtos = studentInfoDos.stream()
                .filter(item -> Objects.equals(item.getClassId(), classInfoDo.getClassId()))
                .map(StudentMapper.MAPPER::toStudentInfoDto)
                .collect(Collectors.toList());
        List<TeacherInfoDto> teacherInfoDtos = teacherInfoDos.stream()
                .filter(item -> Objects.equals(item.getClassId(), classInfoDo.getClassId()))
                .map(TeacherMapper.MAPPER::toTeacherInfoDto)
                .collect(Collectors.toList());

        ClassInfoDto classInfoDto = ClassMapper.MAPPER.toClassInfoDto(classInfoDo);
        classInfoDto.setStudents(studentInfoDtos);
        classInfoDto.setTeachers(teacherInfoDtos);
        return classInfoDto;
    }
}

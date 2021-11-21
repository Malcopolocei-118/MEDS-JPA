package com.meds.application;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.service.ClassDomainService;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.domain.student.service.StudentDomainService;
import com.meds.application.assembler.StudentMapper;
import com.meds.exception.ExceptionCode;
import com.meds.exception.ManagementExceptionCode;
import com.meds.presentation.vo.StudentInfoVo;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class StudentApplicationService {

    private final StudentDomainService studentDomainService;

    private final ClassDomainService classDomainService;

    public void saveStudent(StudentRegisterDto registerDto) {
        StudentRegisterDo registerDo = StudentMapper.MAPPER.toStudentRegisterDo(registerDto);
        registerDo.setStudentId(UUID.randomUUID().toString());
        studentDomainService.saveStudent(registerDo);
    }


    public void deleteStudentById(Long id) {
        StudentInfoDo studentInfoDo = studentDomainService.findStudentById(id);
        if (Optional.ofNullable(studentInfoDo.getClassId()).isPresent()) {
            ClassInfoDo classInfoDo = classDomainService.findClassByClassId(studentInfoDo.getClassId());
            classInfoDo.setStudentSize(classInfoDo.getStudentSize() - 1);
            classDomainService.save(classInfoDo);
        }
        studentDomainService.deleteStudentById(id);
    }

    public List<StudentInfoDto> findAllUngrouping() {
        List<StudentInfoDo> studentInfoDos = studentDomainService.findAllUngrouping();
        return studentInfoDos.stream()
                .map(StudentMapper.MAPPER::toStudentInfoDto)
                .collect(Collectors.toList());
    }

    public StudentInfoDto findByStudentId(Long id) {
        StudentInfoDo studentInfoDo = studentDomainService.findStudentById(id);
        return StudentMapper.MAPPER.toStudentInfoDto(studentInfoDo);
    }

}

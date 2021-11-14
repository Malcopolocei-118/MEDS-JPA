package com.meds.application;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.domain.student.service.StudentDomainService;
import com.meds.application.assembler.StudentMapper;
import com.meds.presentation.vo.StudentInfoVo;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class StudentApplicationService {

    private final StudentDomainService studentDomainService;

    public void saveStudent(StudentRegisterDto registerDto) {
        StudentRegisterDo registerDo = StudentMapper.MAPPER.toStudentRegisterDo(registerDto);
        studentDomainService.saveStudent(registerDo);
    }

    public void deleteStudentById(Long id) {
        studentDomainService.deleteStudentById(id);
    }

    public List<StudentInfoDto> findAllUngrouping() {
        List<StudentInfoDo> studentInfoDos = studentDomainService.findAllUngrouping();
        return studentInfoDos.stream()
                .map(StudentMapper.MAPPER::toStudentInfoDto)
                .collect(Collectors.toList());
    }
}
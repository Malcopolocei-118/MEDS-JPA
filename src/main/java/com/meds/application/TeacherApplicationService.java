package com.meds.application;

import com.meds.application.assembler.TeacherMapper;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.service.TeacherDomainService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeacherApplicationService {

    private final TeacherDomainService teacherDomainService;


    public void saveTeacher(TeacherRegisterDto requestDto) {
        teacherDomainService.saveTeacher(TeacherMapper.MAPPER.toTeacherRegisterDo(requestDto));
    }

    public void deleteTeacherById(Long id) {
        teacherDomainService.deleteTeacherById(id);
    }

    public List<TeacherInfoDto> findAllUngrouping() {
        List<TeacherInfoDo> teacherInfoDos = teacherDomainService.findAllUngrouping();
        return teacherInfoDos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoDto)
                .collect(Collectors.toList());
    }
}

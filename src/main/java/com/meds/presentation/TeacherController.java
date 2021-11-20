package com.meds.presentation;

import com.meds.application.TeacherApplicationService;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.infrastructure.entity.TeacherInfoPo;
import com.meds.presentation.assembler.TeacherMapper;
import com.meds.presentation.vo.StudentInfoVo;
import com.meds.presentation.vo.TeacherInfoVo;
import com.meds.presentation.vo.TeacherRegisterVo;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherApplicationService teacherApplicationService;

    public TeacherController(TeacherApplicationService teacherApplicationService) {
        this.teacherApplicationService = teacherApplicationService;
    }

    @ApiOperation("注册老师")
    @PostMapping
    public void saveStudent(@Validated @RequestBody TeacherRegisterVo requestVo) {
        TeacherRegisterDto requestDto = TeacherMapper.MAPPER.toTeacherRegisterDto(requestVo);
        teacherApplicationService.saveTeacher(requestDto);
    }

    @ApiOperation("删除老师")
    @DeleteMapping("/management/{id}")
    public void deleteTeacherById(@PathVariable Long id) {
        teacherApplicationService.deleteTeacherById(id);
    }

    @ApiOperation("查看未分班级的教师")
    @GetMapping("/ungrouping")
    public List<TeacherInfoVo> findAllUngroupedStudent() {
        List<TeacherInfoDto> teacherDtos = teacherApplicationService.findAllUngrouping();
        return teacherDtos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoVo)
                .collect(Collectors.toList());
    }

    @ApiOperation("通过id查找老师")
    @GetMapping("/{id}")
    public TeacherInfoVo findTeacherById(@PathVariable Long id) {
        TeacherInfoDto teacherInfoDto = teacherApplicationService.findTeacherById(id);
        return TeacherMapper.MAPPER.toTeacherInfoVo(teacherInfoDto);
    }
}

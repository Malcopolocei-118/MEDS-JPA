package com.meds.presentation;

import com.meds.application.StudentApplicationService;
import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.presentation.assembler.StudentMapper;
import com.meds.presentation.vo.StudentInfoVo;
import com.meds.presentation.vo.StudentRegisterVo;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
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
@AllArgsConstructor
@Slf4j
@RequestMapping("/students")
public class StudentController {

    private final StudentApplicationService studentApplicationService;

    @ApiOperation("注册学生")
    @PostMapping
    public void saveStudent(@Validated @RequestBody StudentRegisterVo requestVo) {
        StudentRegisterDto requestDto = StudentMapper.MAPPER.toStudentRegisterDto(requestVo);
        studentApplicationService.saveStudent(requestDto);
    }

    @ApiOperation("删除")
    @DeleteMapping("/management/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentApplicationService.deleteStudentById(id);
    }

    @ApiOperation("查看未分班级的学生")
    @GetMapping("/ungrouping")
    public List<StudentInfoVo> findAllUngroupedStudent() {
        List<StudentInfoDto> studentInfoDtos = studentApplicationService.findAllUngrouping();
        return studentInfoDtos.stream()
                .map(StudentMapper.MAPPER::toStudentInfoVo)
                .collect(Collectors.toList());
    }

    @ApiOperation("根据id查找学生")
    @GetMapping("/{id}")
    public StudentInfoVo findStudentById(@PathVariable Long id) {
        //占位置
        StudentInfoDto studentInfoDto = studentApplicationService.findByStudentId(id);
        return StudentMapper.MAPPER.toStudentInfoVo(studentInfoDto);
    }
}

package com.meds.presentation;

import com.meds.application.ClassApplicationService;
import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.presentation.assembler.ClassMapper;
import com.meds.presentation.vo.ClassInfoVo;
import com.meds.presentation.vo.ClassRegisterVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")
@AllArgsConstructor
public class ClassController {

    private final ClassApplicationService classApplicationService;

    @ApiOperation("添加班级")
    @PostMapping
    public void saveClassInfo(@Validated @RequestBody ClassRegisterVo classRegisterVo) {
        ClassRegisterDto classRegisterDto = ClassMapper.MAPPER.toClassRegisterDto(classRegisterVo);
        classApplicationService.saveClassInfo(classRegisterDto);
    }

    @ApiOperation("查看指定班级信息")
    @GetMapping("/{id}")
    public ClassInfoVo findClassById(@PathVariable Long id) {
        ClassInfoDto classInfoDto = classApplicationService.findClassById(id);
        return ClassMapper.MAPPER.toClassInfoVo(classInfoDto);
    }

    @ApiOperation("根据班级id和学生id分配学生到指定班级")
    @GetMapping("/management/students/{classId}/{studentId}")
    public void groupStudentByClassId(@PathVariable Long classId, @PathVariable Long studentId) {
        classApplicationService.groupStudentByClassId(classId, studentId);
    }

    @ApiOperation("根据班级id和教师id分配学生到指定班级")
    @GetMapping("management/teachers/{classId}/{teacherId}")
    public void groupTeacherByClassId(@PathVariable Long classId, @PathVariable Long teacherId) {
         classApplicationService.groupTeacherByClassId(classId, teacherId);
    }

    @ApiOperation("根据班级id和学生id移除学生")
    @GetMapping("/management/students/removement/{classId}/{studentId}")
    public void removeStudentById(@PathVariable Long classId, @PathVariable Long studentId) {
        classApplicationService.removeStudentById(classId, studentId);
    }

    @ApiOperation("根据班级id和教师id移除教师")
    @GetMapping("/management/teachers/removement/{classId}/{teacherId}")
    public void removeTeacherById(@PathVariable Long classId, @PathVariable Long teacherId) {
        classApplicationService.removeTeacherById(classId, teacherId);
    }

    @ApiOperation("根据班级Id删除班级")
    @DeleteMapping("/management/{id}")
    public void deleteClassById(@PathVariable Long id) {
        classApplicationService.deleteClassById(id);
    }

    @ApiOperation("根据班级Id查看班级详情")
    @GetMapping("/detail/{id}")
    public ClassInfoVo getClassDetailById(@PathVariable Long id) {
        ClassInfoDto classInfoDto = classApplicationService.getClassDetailById(id);
        return ClassMapper.MAPPER.toClassInfoVo(classInfoDto);
    }
}

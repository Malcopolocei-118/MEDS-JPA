package com.meds.presentation;

import com.meds.application.ClassApplicationService;
import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.infrastructure.entity.ClassInfoPo;
import com.meds.presentation.assembler.ClassMapper;
import com.meds.presentation.vo.ClassInfoVo;
import com.meds.presentation.vo.ClassRegisterVo;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
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

    @ApiOperation("随机分配未分组的学生")
    @GetMapping("/grouping/students")
    public void randomGroupingStudents() {
        //占位置： 随机分配学生
    }

    @ApiOperation("随机分配未分组的老师")
    @GetMapping("/grouping/teachers")
    public void randomGroupingTeachers() {
        //占位置： 随机分配老师
    }

    @ApiOperation("添加班级")
    @PostMapping
    public void saveClassInfo(@Validated @RequestBody ClassRegisterVo classRegisterVo) {
        ClassRegisterDto classRegisterDto = ClassMapper.MAPPER.toClassRegisterDto(classRegisterVo);
        classApplicationService.saveClassInfo(classRegisterDto);
        //占位置
    }

    @ApiOperation("查看指定班级信息")
    @GetMapping("/{id}")
    public ClassInfoVo findClassById(@PathVariable Long id) {
        ClassInfoDto classInfoDto = classApplicationService.findClassById(id);
        return ClassMapper.MAPPER.toClassInfoVo(classInfoDto);
    }
}

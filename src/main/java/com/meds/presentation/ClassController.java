package com.meds.presentation;

import com.meds.infrastructure.entity.ClassInfoPo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @ApiOperation("查看指定班级信息")
    @GetMapping("/{id}")
    public ClassInfoPo findClassById(@PathVariable Long id) {
        //占位置
        return null;
    }

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

}

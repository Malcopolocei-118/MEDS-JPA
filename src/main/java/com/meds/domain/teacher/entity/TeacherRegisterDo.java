package com.meds.domain.teacher.entity;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRegisterDo {

    private String teacherName;

    private String teacherId;

    private Integer age;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;
}

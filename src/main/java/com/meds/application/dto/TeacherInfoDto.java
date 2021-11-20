package com.meds.application.dto;

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
public class TeacherInfoDto {

    private Long id;

    private String teacherId;

    private String teacherName;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;

    private Integer age;

    private String classId;

    private String className;

    private Boolean grouped;

}

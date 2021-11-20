package com.meds.presentation.vo;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherInfoVo {

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

package com.meds.domain.student.entity;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class TeacherInfoDo {
    
    private Long id;

    private String name;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer age;

    private Long salary;

    private Boolean isToClass;

    private Long classId;

    private Long className;

}

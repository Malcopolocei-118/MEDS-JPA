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

    private String name;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Long salary;

    private Integer age;

    private Boolean grouped;

    private Long classId;

    private Long className;

}

package com.meds.application.dto;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherRegisterDto {

    private String name;

    private Integer age;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;
}

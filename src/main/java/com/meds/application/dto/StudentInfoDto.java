package com.meds.application.dto;

import com.meds.common.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StudentInfoDto {

    private Long id;

    private String studentId;

    private String name;

    private Integer age;

    private GenderEnum gender;

    private String classId;

    private String className;

    private Boolean grouped;

}

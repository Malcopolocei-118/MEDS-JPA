package com.meds.domain.student.entity;

import com.meds.common.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class StudentInfoDo {

    private Long id;

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

    private Integer classId;

    private String className;

    private Boolean grouped;


}

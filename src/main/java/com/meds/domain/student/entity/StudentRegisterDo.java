package com.meds.domain.student.entity;

import com.meds.common.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterDo {

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

}

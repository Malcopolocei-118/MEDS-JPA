package com.meds.application.dto;


import com.meds.common.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterDto {

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

    private Integer classNo;

}

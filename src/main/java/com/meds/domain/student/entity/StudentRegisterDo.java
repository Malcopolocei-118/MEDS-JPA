package com.meds.domain.student.entity;

import com.meds.common.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRegisterDo {

    private String studentId;

    private String name;

    private Integer age;

    private GenderEnum gender;

}

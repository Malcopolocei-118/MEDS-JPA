package com.meds.presentation.vo;

import com.meds.common.GenderEnum;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfoVo {

    private Long id;

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

    private Integer classId;

    private String className;

    private Boolean grouped;

}

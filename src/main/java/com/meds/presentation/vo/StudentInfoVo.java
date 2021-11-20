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

    private String studentId;

    private String name;

    private Integer age;

    private GenderEnum gender;

    private String classId;

    private String className;

    private Boolean grouped;

}

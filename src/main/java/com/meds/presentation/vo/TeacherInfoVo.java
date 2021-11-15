package com.meds.presentation.vo;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import javax.persistence.Access;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherInfoVo {

    private Long id;

    private String name;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Long salary;

    private Boolean grouped;

    private Long classId;

    private Long className;

}

package com.meds.domain.student.entity;

import com.meds.common.GenderEnum;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    private String studentId;

    private String name;

    private Integer age;

    private GenderEnum gender;

    private String classId;

    private String className;

    private Boolean grouped;

    public void setPropertiesToNull() {
        className = null;
        classId = null;
        grouped = false;
    }

}

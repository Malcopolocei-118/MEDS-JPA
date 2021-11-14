package com.meds.infrastructure.entity;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "teacher_info")
@Entity
public class
TeacherInfoPo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;

    private Integer age;

    private Boolean grouped = false;

    private Long classId;

    private Long className;
}

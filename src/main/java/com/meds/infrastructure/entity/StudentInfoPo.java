package com.meds.infrastructure.entity;

import com.meds.common.GenderEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_info")
@Entity
public class StudentInfoPo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;

    private String name;

    private Integer age;

    private Integer grade;

    private GenderEnum gender;

    private Integer classId;

    private String className;

    private Boolean grouped = false;

}

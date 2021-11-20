package com.meds.infrastructure.entity;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "teacher_info")
@Entity
@Data
public class TeacherInfoPo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "teacher_id")
    private String teacherId;

    @Column(name = "teacher_name")
    private String teacherName;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;

    private Integer age;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "class_name")
    private String className;

    private Boolean grouped = false;

}

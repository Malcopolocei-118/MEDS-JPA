package com.meds.infrastructure.entity;

import com.meds.common.GenderEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_info")
@Builder
@Entity
public class StudentInfoPo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "student_name")
    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Column(name = "class_id")
    private String classId;

    @Column(name = "class_name")
    private String className;

    private Boolean grouped = false;

}

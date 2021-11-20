package com.meds.infrastructure.entity;

import com.meds.common.ClassLevelEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "class_info")
@Entity
public class ClassInfoPo {

    //班级id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_id")
    private String classId;

    //班级name
    @Column(name = "class_name")
    private String className;

    //班级学生人数
    @Column(name = "student_size")
    private Integer studentSize = 0;

    //班级教师人数
    @Column(name = "teacher_size")
    private Integer teacherSize = 0;

    @Column(name = "level")
    private ClassLevelEnum classLevel;

    @Column(name = "avg_score_chinese")
    private Long avgScoreChinese;

    @Column(name = "avg_score_math")
    private Long avgScoreMath;

    @Column(name = "avg_score_english")
    private Long avgScoreEnglish;

}

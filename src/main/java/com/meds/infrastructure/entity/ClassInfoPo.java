package com.meds.infrastructure.entity;

import com.meds.common.ClassLevelEnum;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "class_info")
@Entity
public class ClassInfoPo {

    //班级id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "class_id")
    private Long id;

    //班级name
    @Column(name = "name")
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

    //List<student>
    @OneToMany(targetEntity = StudentInfoPo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_class_id")
    private List<StudentInfoPo> students;

    //List<Teacher>
    @ManyToMany(targetEntity = ClassInfoPo.class, cascade = CascadeType.ALL)
    @JoinTable(
            name = "class_teacher_info",
            joinColumns = @JoinColumn(name = "class_info_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_info_id")
    )
    private List<TeacherInfoPo> teachers;
}

package com.meds.infrastructure.entity;

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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "class_info")
@Entity
public class ClassInfoPo {

    //班级id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //班级name
    private String name;

    //班级人数
    @Column(name = "class_size")
    private Integer classSize;

    //List<student>
    @OneToMany(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private List<StudentInfoPo> students;

    //List<Teacher>
    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "class_teacher_info",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private List<TeacherInfoPo> teachers;
}

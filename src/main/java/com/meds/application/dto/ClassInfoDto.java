package com.meds.application.dto;

import com.meds.common.ClassLevelEnum;
import com.meds.infrastructure.entity.ClassInfoPo;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassInfoDto {

    private Long Id;

    private String classId;

    private String className;

    private Integer studentSize;

    private Integer teacherSize;

    private ClassLevelEnum classLevel;

    private Long avgScoreChinese;

    private Long avgScoreMath;

    private Long avgScoreEnglish;

    private List<StudentInfoDto> students;

    private List<TeacherInfoDto> teachers;
}

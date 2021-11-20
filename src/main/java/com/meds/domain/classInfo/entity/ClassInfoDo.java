package com.meds.domain.classInfo.entity;

import com.meds.common.ClassLevelEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClassInfoDo {

    private Long id;

    private String classId;

    private String className;

    private Integer studentSize;

    private Integer teacherSize;

    private ClassLevelEnum classLevel;

    private Long avgScoreChinese;

    private Long avgScoreMath;

    private Long avgScoreEnglish;

    private List<StudentInfoDo> students;

    private List<TeacherInfoDo> teachers;

}

package com.meds.domain.classInfo.entity;

import com.meds.common.ClassLevelEnum;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
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

    private String className;

    private Integer studentSize = 0;

    private Integer teacherSize = 0;

    private ClassLevelEnum classLevel;

    private Long avgScoreChinese;

    private Long avgScoreMath;

    private Long avgScoreEnglish;

    private List<StudentInfoPo> students;

    private List<TeacherInfoPo> teachers;

}

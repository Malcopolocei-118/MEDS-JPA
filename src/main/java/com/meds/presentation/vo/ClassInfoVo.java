package com.meds.presentation.vo;

import com.meds.common.ClassLevelEnum;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassInfoVo {

    private Long id;

    private String classId;

    private String className;

    private Integer studentSize;

    private Integer teacherSize;

    private ClassLevelEnum classLevel;

    private Long avgScoreChinese;

    private Long avgScoreMath;

    private Long avgScoreEnglish;

    private List<StudentInfoVo> students;

    private List<TeacherInfoVo> teachers;

}

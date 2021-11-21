package com.meds.domain.teacher.entity;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.infrastructure.entity.ClassInfoPo;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class TeacherInfoDo {

    private Long id;

    private String teacherId;

    private String teacherName;

    private GenderEnum gender;

    private SubjectEnum subject;

    private Integer salary;

    private Integer age;

    private String classId;

    private String className;

    private Boolean grouped;


}

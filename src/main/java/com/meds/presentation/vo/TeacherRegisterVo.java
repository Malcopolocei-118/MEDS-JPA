package com.meds.presentation.vo;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRegisterVo {
    @NotNull
    @ApiModelProperty("教师姓名")
    private String teacherName;

    @NotNull
    @Min(1)
    @ApiModelProperty("教师年龄")
    private Integer age;

    @NotNull
    @Min(1)
    @ApiModelProperty("教师教学科目")
    private SubjectEnum subject;

    @NotNull
    @ApiModelProperty("教师性别")
    private GenderEnum gender;


    @NotNull
    @ApiModelProperty("薪水")
    private Integer salary;
}

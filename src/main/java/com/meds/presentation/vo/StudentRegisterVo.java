package com.meds.presentation.vo;

import com.meds.common.GenderEnum;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import io.swagger.annotations.ApiModelProperty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRegisterVo {

    @NotNull
    @ApiModelProperty("学生姓名")
    private String name;

    @NotNull
    @Min(1)
    @ApiModelProperty("学生年龄")
    private Integer age;

    @NotNull
    @Min(1)
    @ApiModelProperty("学生年级")
    private Integer grade;

    @NotNull
    @ApiModelProperty("学生性别")
    private GenderEnum gender;

}

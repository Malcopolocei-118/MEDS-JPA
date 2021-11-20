package com.meds.presentation.vo;

import com.meds.common.ClassLevelEnum;
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
public class ClassRegisterVo {

    @NotNull
    private String className;

    private ClassLevelEnum classLevel;

}

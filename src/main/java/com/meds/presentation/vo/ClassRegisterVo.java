package com.meds.presentation.vo;

import com.meds.common.ClassLevelEnum;
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

    private String className;

    private ClassLevelEnum classLevel;

}

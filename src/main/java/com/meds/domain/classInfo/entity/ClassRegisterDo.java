package com.meds.domain.classInfo.entity;

import com.meds.common.ClassLevelEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Setter
@Getter
@NoArgsConstructor
public class ClassRegisterDo {

    private String className;

    private ClassLevelEnum classLevel;

}

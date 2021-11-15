package com.meds.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SubjectEnum implements DescriptionalEnum {
    CHINESE(
            "语文"
    ), MATH(
            "数学"
    ), ENGLISH(
            "英语"
    );

    private String description;

    @Override
    public String getDescription() {
        return description;
    }
}

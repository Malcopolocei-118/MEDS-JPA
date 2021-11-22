package com.meds.common;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum GenderEnum implements DescriptionalEnum {
    MALE(
            "男"
    ), FEMALE(
            "女"
    ), OTHER(
            "其他"
    );

    private String description;

    @Override
    public String getDescription() {
        return description ;
    }
}

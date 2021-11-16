package com.meds.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ClassLevelEnum implements DescriptionalEnum{

    BRONZE(
            "黄铜"
    ), SILVER(
            "白银"
    ), GOLD(
            "黄金"
    );

    private String description;

    @Override
    public String getDescription() {
        return description;
    }
}

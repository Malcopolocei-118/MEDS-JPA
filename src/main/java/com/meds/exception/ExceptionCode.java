package com.meds.exception;

public enum ExceptionCode {
    STUDENT_NOT_FOUND(
            "没有找到相应学生信息"
    ), TEACHER_NOT_FOUND(
            "没有找到教师对应的信息"
    ), CLASS_NOT_FOUND(
            "没有找到相应班级信息"
    );

    private final String description;

    ExceptionCode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

CREATE TABLE `class_info`
(
    `id`                BIGINT(10)  NOT NULL AUTO_INCREMENT COMMENT '班级id',
    `class_id`          VARCHAR(50) NOT NULL COMMENT '班级id',
    `class_name`        VARCHAR(30) NOT NULL COMMENT '班级名称',
    `student_size`      INT(3) DEFAULT 0 COMMENT '学生人数',
    `teacher_size`      INT(3) DEFAULT 0 COMMENT '教师人数',
    `level`             VARCHAR(30) COMMENT '班级等级',
    `avg_score_chinese` INT(10) COMMENT '班级语文平均分',
    `avg_score_math`    INT(10) COMMENT '班级数学平均分',
    `avg_score_english` INT(10) COMMENT '班级英语平均分',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`class_id`)
)



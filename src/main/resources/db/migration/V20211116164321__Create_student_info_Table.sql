CREATE TABLE `student_info`
(
    `id`         INT(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `student_id` VARCHAR(50) NOT NULL COMMENT '学生id',
    `student_name`       VARCHAR(30) NOT NULL COMMENT '姓名',
    `age`        INT(3) COMMENT '年龄',
    `gender`     VARCHAR(30) NOT NULL COMMENT '性别: MALE 男 FEMALE 女 OTHER 其他',
    `class_id`   VARCHAR(50) COMMENT '班级id',
    `class_name` VARCHAR(30) COMMENT '班级名称',
    `grouped`    TINYINT     NOT NULL DEFAULT 0 COMMENT '是否需要分班',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`student_id`)
)
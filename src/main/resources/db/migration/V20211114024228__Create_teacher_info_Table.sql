CREATE TABLE `teacher_info`
(
    `id`         INT(10)     NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`       VARCHAR(30) NOT NULL COMMENT '姓名',
    `age`        INT(3) COMMENT '年龄',
    `gender`     VARCHAR(30) NOT NULL COMMENT '性别: MALE 男 FEMALE 女 OTHER 其他',
    `subject`    VARCHAR(30) NOT NULL COMMENT '教学科目：CHINESE 语文 MATH 数学 ENGLISH 英语',
    `salary`     INT(10)     NOT NULL COMMENT '薪水',
    `class_id`   VARCHAR(30) COMMENT '班级id',
    `class_name` VARCHAR(30) COMMENT '班级名称',
    `grouped`    TINYINT     NOT NULL DEFAULT 0 COMMENT '是否需要分班',
PRIMARY KEY (`id`)
)
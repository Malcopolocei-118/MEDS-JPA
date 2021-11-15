package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.infrastructure.entity.StudentInfoPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-14T21:57:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentInfoPo toStudentRegisterDo(StudentRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        StudentInfoPo studentInfoPo = new StudentInfoPo();

        studentInfoPo.setName( registerDo.getName() );
        studentInfoPo.setAge( registerDo.getAge() );
        studentInfoPo.setGrade( registerDo.getGrade() );
        studentInfoPo.setGender( registerDo.getGender() );

        return studentInfoPo;
    }

    @Override
    public StudentInfoDo toStudentInfoDo(StudentInfoPo studentInfoPo) {
        if ( studentInfoPo == null ) {
            return null;
        }

        StudentInfoDo studentInfoDo = new StudentInfoDo();

        studentInfoDo.setId( studentInfoPo.getId() );
        studentInfoDo.setName( studentInfoPo.getName() );
        studentInfoDo.setAge( studentInfoPo.getAge() );
        studentInfoDo.setGrade( studentInfoPo.getGrade() );
        studentInfoDo.setGender( studentInfoPo.getGender() );
        studentInfoDo.setClassId( studentInfoPo.getClassId() );
        studentInfoDo.setClassName( studentInfoPo.getClassName() );
        studentInfoDo.setGrouped( studentInfoPo.getGrouped() );

        return studentInfoDo;
    }
}

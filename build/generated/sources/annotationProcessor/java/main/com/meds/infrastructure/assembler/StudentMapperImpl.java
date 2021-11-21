package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.infrastructure.entity.StudentInfoPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T09:57:37+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentInfoPo toStudentRegisterDo(StudentRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        StudentInfoPo studentInfoPo = new StudentInfoPo();

        studentInfoPo.setStudentId( registerDo.getStudentId() );
        studentInfoPo.setName( registerDo.getName() );
        studentInfoPo.setAge( registerDo.getAge() );
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
        studentInfoDo.setStudentId( studentInfoPo.getStudentId() );
        studentInfoDo.setName( studentInfoPo.getName() );
        studentInfoDo.setAge( studentInfoPo.getAge() );
        studentInfoDo.setGender( studentInfoPo.getGender() );
        studentInfoDo.setClassId( studentInfoPo.getClassId() );
        studentInfoDo.setClassName( studentInfoPo.getClassName() );
        studentInfoDo.setGrouped( studentInfoPo.getGrouped() );

        return studentInfoDo;
    }

    @Override
    public StudentInfoPo toStudentInfoPo(StudentInfoDo studentInfoDo) {
        if ( studentInfoDo == null ) {
            return null;
        }

        StudentInfoPo studentInfoPo = new StudentInfoPo();

        studentInfoPo.setId( studentInfoDo.getId() );
        studentInfoPo.setStudentId( studentInfoDo.getStudentId() );
        studentInfoPo.setName( studentInfoDo.getName() );
        studentInfoPo.setAge( studentInfoDo.getAge() );
        studentInfoPo.setGender( studentInfoDo.getGender() );
        studentInfoPo.setClassId( studentInfoDo.getClassId() );
        studentInfoPo.setClassName( studentInfoDo.getClassName() );
        studentInfoPo.setGrouped( studentInfoDo.getGrouped() );

        return studentInfoPo;
    }
}

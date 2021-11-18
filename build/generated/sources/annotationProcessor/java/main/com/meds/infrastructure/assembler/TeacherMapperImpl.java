package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:59:35+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherInfoPo toTeacherInfoPo(TeacherRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        TeacherInfoPo teacherInfoPo = new TeacherInfoPo();

        teacherInfoPo.setName( registerDo.getName() );
        teacherInfoPo.setGender( registerDo.getGender() );
        teacherInfoPo.setSubject( registerDo.getSubject() );
        teacherInfoPo.setSalary( registerDo.getSalary() );
        teacherInfoPo.setAge( registerDo.getAge() );

        return teacherInfoPo;
    }

    @Override
    public TeacherInfoDo toTeacherInfoDo(TeacherInfoPo teacherInfoPo) {
        if ( teacherInfoPo == null ) {
            return null;
        }

        TeacherInfoDo teacherInfoDo = new TeacherInfoDo();

        teacherInfoDo.setId( teacherInfoPo.getId() );
        teacherInfoDo.setName( teacherInfoPo.getName() );
        teacherInfoDo.setGender( teacherInfoPo.getGender() );
        teacherInfoDo.setSubject( teacherInfoPo.getSubject() );
        teacherInfoDo.setAge( teacherInfoPo.getAge() );
        if ( teacherInfoPo.getSalary() != null ) {
            teacherInfoDo.setSalary( teacherInfoPo.getSalary().longValue() );
        }
        teacherInfoDo.setClassId( teacherInfoPo.getClassId() );
        teacherInfoDo.setClassName( teacherInfoPo.getClassName() );

        return teacherInfoDo;
    }
}

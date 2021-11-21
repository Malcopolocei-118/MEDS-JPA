package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.entity.TeacherRegisterDo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T09:57:37+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherInfoPo toTeacherInfoPo(TeacherRegisterDo registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        TeacherInfoPo teacherInfoPo = new TeacherInfoPo();

        teacherInfoPo.setTeacherId( registerDo.getTeacherId() );
        teacherInfoPo.setTeacherName( registerDo.getTeacherName() );
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
        teacherInfoDo.setTeacherId( teacherInfoPo.getTeacherId() );
        teacherInfoDo.setTeacherName( teacherInfoPo.getTeacherName() );
        teacherInfoDo.setGender( teacherInfoPo.getGender() );
        teacherInfoDo.setSubject( teacherInfoPo.getSubject() );
        teacherInfoDo.setSalary( teacherInfoPo.getSalary() );
        teacherInfoDo.setAge( teacherInfoPo.getAge() );
        teacherInfoDo.setClassId( teacherInfoPo.getClassId() );
        teacherInfoDo.setClassName( teacherInfoPo.getClassName() );
        teacherInfoDo.setGrouped( teacherInfoPo.getGrouped() );

        return teacherInfoDo;
    }

    @Override
    public TeacherInfoPo toTeacherInfoPo(TeacherInfoDo teacherInfoDo) {
        if ( teacherInfoDo == null ) {
            return null;
        }

        TeacherInfoPo teacherInfoPo = new TeacherInfoPo();

        teacherInfoPo.setId( teacherInfoDo.getId() );
        teacherInfoPo.setTeacherId( teacherInfoDo.getTeacherId() );
        teacherInfoPo.setTeacherName( teacherInfoDo.getTeacherName() );
        teacherInfoPo.setGender( teacherInfoDo.getGender() );
        teacherInfoPo.setSubject( teacherInfoDo.getSubject() );
        teacherInfoPo.setSalary( teacherInfoDo.getSalary() );
        teacherInfoPo.setAge( teacherInfoDo.getAge() );
        teacherInfoPo.setClassId( teacherInfoDo.getClassId() );
        teacherInfoPo.setClassName( teacherInfoDo.getClassName() );
        teacherInfoPo.setGrouped( teacherInfoDo.getGrouped() );

        return teacherInfoPo;
    }
}

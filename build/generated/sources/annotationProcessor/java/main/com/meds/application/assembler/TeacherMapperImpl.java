package com.meds.application.assembler;

import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:02:09+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherRegisterDo toTeacherRegisterDo(TeacherRegisterDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        TeacherRegisterDo teacherRegisterDo = new TeacherRegisterDo();

        teacherRegisterDo.setName( requestDto.getName() );
        teacherRegisterDo.setAge( requestDto.getAge() );
        teacherRegisterDo.setGender( requestDto.getGender() );
        teacherRegisterDo.setSubject( requestDto.getSubject() );
        teacherRegisterDo.setSalary( requestDto.getSalary() );

        return teacherRegisterDo;
    }

    @Override
    public TeacherInfoDto toTeacherInfoDto(TeacherInfoDo teacherInfoDo) {
        if ( teacherInfoDo == null ) {
            return null;
        }

        TeacherInfoDto teacherInfoDto = new TeacherInfoDto();

        teacherInfoDto.setId( teacherInfoDo.getId() );
        teacherInfoDto.setName( teacherInfoDo.getName() );
        teacherInfoDto.setGender( teacherInfoDo.getGender() );
        teacherInfoDto.setSubject( teacherInfoDo.getSubject() );
        teacherInfoDto.setSalary( teacherInfoDo.getSalary() );
        teacherInfoDto.setAge( teacherInfoDo.getAge() );
        teacherInfoDto.setClassId( teacherInfoDo.getClassId() );
        teacherInfoDto.setClassName( teacherInfoDo.getClassName() );

        return teacherInfoDto;
    }

    @Override
    public TeacherInfoDto toTeacherInfoDo(TeacherInfoDo teacherInfoDo) {
        if ( teacherInfoDo == null ) {
            return null;
        }

        TeacherInfoDto teacherInfoDto = new TeacherInfoDto();

        teacherInfoDto.setId( teacherInfoDo.getId() );
        teacherInfoDto.setName( teacherInfoDo.getName() );
        teacherInfoDto.setGender( teacherInfoDo.getGender() );
        teacherInfoDto.setSubject( teacherInfoDo.getSubject() );
        teacherInfoDto.setSalary( teacherInfoDo.getSalary() );
        teacherInfoDto.setAge( teacherInfoDo.getAge() );
        teacherInfoDto.setClassId( teacherInfoDo.getClassId() );
        teacherInfoDto.setClassName( teacherInfoDo.getClassName() );

        return teacherInfoDto;
    }
}

package com.meds.presentation.assembler;

import com.meds.application.dto.TeacherInfoDto;
import com.meds.application.dto.TeacherRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.presentation.vo.TeacherInfoVo;
import com.meds.presentation.vo.TeacherRegisterVo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:59:35+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherRegisterDto toTeacherRegisterDto(TeacherRegisterVo requestVo) {
        if ( requestVo == null ) {
            return null;
        }

        TeacherRegisterDto teacherRegisterDto = new TeacherRegisterDto();

        teacherRegisterDto.setName( requestVo.getName() );
        teacherRegisterDto.setAge( requestVo.getAge() );
        teacherRegisterDto.setGender( requestVo.getGender() );
        teacherRegisterDto.setSubject( requestVo.getSubject() );
        teacherRegisterDto.setSalary( requestVo.getSalary() );

        return teacherRegisterDto;
    }

    @Override
    public TeacherInfoVo toTeacherInfoVo(TeacherInfoDto teacherInfoDto) {
        if ( teacherInfoDto == null ) {
            return null;
        }

        TeacherInfoVo teacherInfoVo = new TeacherInfoVo();

        teacherInfoVo.setId( teacherInfoDto.getId() );
        teacherInfoVo.setName( teacherInfoDto.getName() );
        teacherInfoVo.setGender( teacherInfoDto.getGender() );
        teacherInfoVo.setSubject( teacherInfoDto.getSubject() );
        teacherInfoVo.setSalary( teacherInfoDto.getSalary() );
        teacherInfoVo.setGrouped( teacherInfoDto.getGrouped() );
        teacherInfoVo.setClassId( teacherInfoDto.getClassId() );
        teacherInfoVo.setClassName( teacherInfoDto.getClassName() );

        return teacherInfoVo;
    }
}

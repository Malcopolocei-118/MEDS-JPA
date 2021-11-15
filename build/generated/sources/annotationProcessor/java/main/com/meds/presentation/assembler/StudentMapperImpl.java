package com.meds.presentation.assembler;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.presentation.vo.StudentInfoVo;
import com.meds.presentation.vo.StudentRegisterVo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-14T21:57:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentRegisterDto toStudentRegisterDto(StudentRegisterVo requestVo) {
        if ( requestVo == null ) {
            return null;
        }

        StudentRegisterDto studentRegisterDto = new StudentRegisterDto();

        studentRegisterDto.setName( requestVo.getName() );
        studentRegisterDto.setAge( requestVo.getAge() );
        studentRegisterDto.setGrade( requestVo.getGrade() );
        studentRegisterDto.setGender( requestVo.getGender() );

        return studentRegisterDto;
    }

    @Override
    public StudentInfoVo toStudentInfoVo(StudentInfoDto studentInfoDto) {
        if ( studentInfoDto == null ) {
            return null;
        }

        StudentInfoVo studentInfoVo = new StudentInfoVo();

        studentInfoVo.setId( studentInfoDto.getId() );
        studentInfoVo.setName( studentInfoDto.getName() );
        studentInfoVo.setAge( studentInfoDto.getAge() );
        studentInfoVo.setGrade( studentInfoDto.getGrade() );
        studentInfoVo.setGender( studentInfoDto.getGender() );
        studentInfoVo.setClassId( studentInfoDto.getClassId() );
        studentInfoVo.setClassName( studentInfoDto.getClassName() );
        studentInfoVo.setGrouped( studentInfoDto.getGrouped() );

        return studentInfoVo;
    }
}

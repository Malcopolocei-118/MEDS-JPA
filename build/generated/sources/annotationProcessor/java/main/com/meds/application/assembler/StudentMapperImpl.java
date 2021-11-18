package com.meds.application.assembler;

import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.StudentRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:59:35+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentRegisterDo toStudentRegisterDo(StudentRegisterDto registerDo) {
        if ( registerDo == null ) {
            return null;
        }

        StudentRegisterDo studentRegisterDo = new StudentRegisterDo();

        studentRegisterDo.setName( registerDo.getName() );
        studentRegisterDo.setAge( registerDo.getAge() );
        studentRegisterDo.setGrade( registerDo.getGrade() );
        studentRegisterDo.setGender( registerDo.getGender() );

        return studentRegisterDo;
    }

    @Override
    public StudentInfoDto toStudentInfoDto(StudentInfoDo studentInfoDo) {
        if ( studentInfoDo == null ) {
            return null;
        }

        StudentInfoDto studentInfoDto = new StudentInfoDto();

        studentInfoDto.setId( studentInfoDo.getId() );
        studentInfoDto.setName( studentInfoDo.getName() );
        studentInfoDto.setAge( studentInfoDo.getAge() );
        studentInfoDto.setGrade( studentInfoDo.getGrade() );
        studentInfoDto.setGender( studentInfoDo.getGender() );
        studentInfoDto.setClassId( studentInfoDo.getClassId() );
        studentInfoDto.setClassName( studentInfoDo.getClassName() );
        studentInfoDto.setGrouped( studentInfoDo.getGrouped() );

        return studentInfoDto;
    }
}

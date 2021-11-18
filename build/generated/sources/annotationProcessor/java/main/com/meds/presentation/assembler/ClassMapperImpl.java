package com.meds.presentation.assembler;

import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.common.ClassLevelEnum;
import com.meds.presentation.vo.ClassInfoVo;
import com.meds.presentation.vo.ClassRegisterVo;
import com.meds.presentation.vo.StudentInfoVo;
import com.meds.presentation.vo.TeacherInfoVo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:59:35+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassRegisterDto toClassRegisterDto(ClassRegisterVo classRegisterVo) {
        if ( classRegisterVo == null ) {
            return null;
        }

        ClassRegisterDto classRegisterDto = new ClassRegisterDto();

        classRegisterDto.setClassName( classRegisterVo.getClassName() );
        classRegisterDto.setClassLevel( classRegisterVo.getClassLevel() );

        return classRegisterDto;
    }

    @Override
    public ClassInfoVo toClassInfoVo(ClassInfoDto classInfoDto) {
        if ( classInfoDto == null ) {
            return null;
        }

        ClassInfoVo classInfoVo = new ClassInfoVo();

        classInfoVo.setId( classInfoDto.getId() );
        classInfoVo.setClassName( classInfoDto.getClassName() );
        classInfoVo.setStudentSize( classInfoDto.getStudentSize() );
        classInfoVo.setTeacherSize( classInfoDto.getTeacherSize() );
        classInfoVo.setClassLevel( classInfoDto.getClassLevel() );
        classInfoVo.setAvgScoreChinese( classInfoDto.getAvgScoreChinese() );
        classInfoVo.setAvgScoreMath( classInfoDto.getAvgScoreMath() );
        classInfoVo.setAvgScoreEnglish( classInfoDto.getAvgScoreEnglish() );
        classInfoVo.setStudents( studentInfoDtoListToStudentInfoVoList( classInfoDto.getStudents() ) );
        classInfoVo.setTeachers( teacherInfoDtoListToTeacherInfoVoList( classInfoDto.getTeachers() ) );

        return classInfoVo;
    }

    protected StudentInfoVo studentInfoDtoToStudentInfoVo(StudentInfoDto studentInfoDto) {
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

    protected List<StudentInfoVo> studentInfoDtoListToStudentInfoVoList(List<StudentInfoDto> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentInfoVo> list1 = new ArrayList<StudentInfoVo>( list.size() );
        for ( StudentInfoDto studentInfoDto : list ) {
            list1.add( studentInfoDtoToStudentInfoVo( studentInfoDto ) );
        }

        return list1;
    }

    protected TeacherInfoVo teacherInfoDtoToTeacherInfoVo(TeacherInfoDto teacherInfoDto) {
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

    protected List<TeacherInfoVo> teacherInfoDtoListToTeacherInfoVoList(List<TeacherInfoDto> list) {
        if ( list == null ) {
            return null;
        }

        List<TeacherInfoVo> list1 = new ArrayList<TeacherInfoVo>( list.size() );
        for ( TeacherInfoDto teacherInfoDto : list ) {
            list1.add( teacherInfoDtoToTeacherInfoVo( teacherInfoDto ) );
        }

        return list1;
    }
}

package com.meds.application.assembler;

import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.application.dto.StudentInfoDto;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T09:57:37+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassRegisterDo toClassRegisterDo(ClassRegisterDto classRegisterDto) {
        if ( classRegisterDto == null ) {
            return null;
        }

        ClassRegisterDo classRegisterDo = new ClassRegisterDo();

        classRegisterDo.setClassName( classRegisterDto.getClassName() );
        classRegisterDo.setClassLevel( classRegisterDto.getClassLevel() );

        return classRegisterDo;
    }

    @Override
    public ClassInfoDto toClassInfoDto(ClassInfoDo classInfoDo) {
        if ( classInfoDo == null ) {
            return null;
        }

        ClassInfoDto classInfoDto = new ClassInfoDto();

        classInfoDto.setId( classInfoDo.getId() );
        classInfoDto.setClassId( classInfoDo.getClassId() );
        classInfoDto.setClassName( classInfoDo.getClassName() );
        classInfoDto.setStudentSize( classInfoDo.getStudentSize() );
        classInfoDto.setTeacherSize( classInfoDo.getTeacherSize() );
        classInfoDto.setClassLevel( classInfoDo.getClassLevel() );
        classInfoDto.setAvgScoreChinese( classInfoDo.getAvgScoreChinese() );
        classInfoDto.setAvgScoreMath( classInfoDo.getAvgScoreMath() );
        classInfoDto.setAvgScoreEnglish( classInfoDo.getAvgScoreEnglish() );
        classInfoDto.setStudents( studentInfoDoListToStudentInfoDtoList( classInfoDo.getStudents() ) );
        classInfoDto.setTeachers( teacherInfoDoListToTeacherInfoDtoList( classInfoDo.getTeachers() ) );

        return classInfoDto;
    }

    protected StudentInfoDto studentInfoDoToStudentInfoDto(StudentInfoDo studentInfoDo) {
        if ( studentInfoDo == null ) {
            return null;
        }

        StudentInfoDto studentInfoDto = new StudentInfoDto();

        studentInfoDto.setId( studentInfoDo.getId() );
        studentInfoDto.setStudentId( studentInfoDo.getStudentId() );
        studentInfoDto.setName( studentInfoDo.getName() );
        studentInfoDto.setAge( studentInfoDo.getAge() );
        studentInfoDto.setGender( studentInfoDo.getGender() );
        studentInfoDto.setClassId( studentInfoDo.getClassId() );
        studentInfoDto.setClassName( studentInfoDo.getClassName() );
        studentInfoDto.setGrouped( studentInfoDo.getGrouped() );

        return studentInfoDto;
    }

    protected List<StudentInfoDto> studentInfoDoListToStudentInfoDtoList(List<StudentInfoDo> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentInfoDto> list1 = new ArrayList<StudentInfoDto>( list.size() );
        for ( StudentInfoDo studentInfoDo : list ) {
            list1.add( studentInfoDoToStudentInfoDto( studentInfoDo ) );
        }

        return list1;
    }

    protected TeacherInfoDto teacherInfoDoToTeacherInfoDto(TeacherInfoDo teacherInfoDo) {
        if ( teacherInfoDo == null ) {
            return null;
        }

        TeacherInfoDto teacherInfoDto = new TeacherInfoDto();

        teacherInfoDto.setId( teacherInfoDo.getId() );
        teacherInfoDto.setTeacherId( teacherInfoDo.getTeacherId() );
        teacherInfoDto.setTeacherName( teacherInfoDo.getTeacherName() );
        teacherInfoDto.setGender( teacherInfoDo.getGender() );
        teacherInfoDto.setSubject( teacherInfoDo.getSubject() );
        teacherInfoDto.setSalary( teacherInfoDo.getSalary() );
        teacherInfoDto.setAge( teacherInfoDo.getAge() );
        teacherInfoDto.setClassId( teacherInfoDo.getClassId() );
        teacherInfoDto.setClassName( teacherInfoDo.getClassName() );
        teacherInfoDto.setGrouped( teacherInfoDo.getGrouped() );

        return teacherInfoDto;
    }

    protected List<TeacherInfoDto> teacherInfoDoListToTeacherInfoDtoList(List<TeacherInfoDo> list) {
        if ( list == null ) {
            return null;
        }

        List<TeacherInfoDto> list1 = new ArrayList<TeacherInfoDto>( list.size() );
        for ( TeacherInfoDo teacherInfoDo : list ) {
            list1.add( teacherInfoDoToTeacherInfoDto( teacherInfoDo ) );
        }

        return list1;
    }
}

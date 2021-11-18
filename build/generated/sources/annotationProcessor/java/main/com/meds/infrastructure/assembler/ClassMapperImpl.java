package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.infrastructure.entity.ClassInfoPo;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
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
    public ClassInfoPo toClassInfoPo(ClassRegisterDo classRegisterDo) {
        if ( classRegisterDo == null ) {
            return null;
        }

        ClassInfoPo classInfoPo = new ClassInfoPo();

        classInfoPo.setClassName( classRegisterDo.getClassName() );
        classInfoPo.setClassLevel( classRegisterDo.getClassLevel() );

        return classInfoPo;
    }

    @Override
    public ClassInfoDo toClassInfoDo(ClassInfoPo classInfoPo) {
        if ( classInfoPo == null ) {
            return null;
        }

        ClassInfoDo classInfoDo = new ClassInfoDo();

        classInfoDo.setId( classInfoPo.getId() );
        classInfoDo.setClassName( classInfoPo.getClassName() );
        classInfoDo.setStudentSize( classInfoPo.getStudentSize() );
        classInfoDo.setTeacherSize( classInfoPo.getTeacherSize() );
        classInfoDo.setClassLevel( classInfoPo.getClassLevel() );
        classInfoDo.setAvgScoreChinese( classInfoPo.getAvgScoreChinese() );
        classInfoDo.setAvgScoreMath( classInfoPo.getAvgScoreMath() );
        classInfoDo.setAvgScoreEnglish( classInfoPo.getAvgScoreEnglish() );
        classInfoDo.setStudents( studentInfoPoListToStudentInfoDoList( classInfoPo.getStudents() ) );
        classInfoDo.setTeachers( teacherInfoPoListToTeacherInfoDoList( classInfoPo.getTeachers() ) );

        return classInfoDo;
    }

    @Override
    public ClassInfoPo toClassInfoPo(ClassInfoDo classInfoDo) {
        if ( classInfoDo == null ) {
            return null;
        }

        ClassInfoPo classInfoPo = new ClassInfoPo();

        classInfoPo.setId( classInfoDo.getId() );
        classInfoPo.setClassName( classInfoDo.getClassName() );
        classInfoPo.setStudentSize( classInfoDo.getStudentSize() );
        classInfoPo.setTeacherSize( classInfoDo.getTeacherSize() );
        classInfoPo.setClassLevel( classInfoDo.getClassLevel() );
        classInfoPo.setAvgScoreChinese( classInfoDo.getAvgScoreChinese() );
        classInfoPo.setAvgScoreMath( classInfoDo.getAvgScoreMath() );
        classInfoPo.setAvgScoreEnglish( classInfoDo.getAvgScoreEnglish() );
        classInfoPo.setStudents( studentInfoDoListToStudentInfoPoList( classInfoDo.getStudents() ) );
        classInfoPo.setTeachers( teacherInfoDoListToTeacherInfoPoList( classInfoDo.getTeachers() ) );

        return classInfoPo;
    }

    protected StudentInfoDo studentInfoPoToStudentInfoDo(StudentInfoPo studentInfoPo) {
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

    protected List<StudentInfoDo> studentInfoPoListToStudentInfoDoList(List<StudentInfoPo> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentInfoDo> list1 = new ArrayList<StudentInfoDo>( list.size() );
        for ( StudentInfoPo studentInfoPo : list ) {
            list1.add( studentInfoPoToStudentInfoDo( studentInfoPo ) );
        }

        return list1;
    }

    protected TeacherInfoDo teacherInfoPoToTeacherInfoDo(TeacherInfoPo teacherInfoPo) {
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

    protected List<TeacherInfoDo> teacherInfoPoListToTeacherInfoDoList(List<TeacherInfoPo> list) {
        if ( list == null ) {
            return null;
        }

        List<TeacherInfoDo> list1 = new ArrayList<TeacherInfoDo>( list.size() );
        for ( TeacherInfoPo teacherInfoPo : list ) {
            list1.add( teacherInfoPoToTeacherInfoDo( teacherInfoPo ) );
        }

        return list1;
    }

    protected StudentInfoPo studentInfoDoToStudentInfoPo(StudentInfoDo studentInfoDo) {
        if ( studentInfoDo == null ) {
            return null;
        }

        StudentInfoPo studentInfoPo = new StudentInfoPo();

        studentInfoPo.setId( studentInfoDo.getId() );
        studentInfoPo.setName( studentInfoDo.getName() );
        studentInfoPo.setAge( studentInfoDo.getAge() );
        studentInfoPo.setGrade( studentInfoDo.getGrade() );
        studentInfoPo.setGender( studentInfoDo.getGender() );
        studentInfoPo.setClassId( studentInfoDo.getClassId() );
        studentInfoPo.setClassName( studentInfoDo.getClassName() );
        studentInfoPo.setGrouped( studentInfoDo.getGrouped() );

        return studentInfoPo;
    }

    protected List<StudentInfoPo> studentInfoDoListToStudentInfoPoList(List<StudentInfoDo> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentInfoPo> list1 = new ArrayList<StudentInfoPo>( list.size() );
        for ( StudentInfoDo studentInfoDo : list ) {
            list1.add( studentInfoDoToStudentInfoPo( studentInfoDo ) );
        }

        return list1;
    }

    protected TeacherInfoPo teacherInfoDoToTeacherInfoPo(TeacherInfoDo teacherInfoDo) {
        if ( teacherInfoDo == null ) {
            return null;
        }

        TeacherInfoPo teacherInfoPo = new TeacherInfoPo();

        teacherInfoPo.setId( teacherInfoDo.getId() );
        teacherInfoPo.setName( teacherInfoDo.getName() );
        teacherInfoPo.setGender( teacherInfoDo.getGender() );
        teacherInfoPo.setSubject( teacherInfoDo.getSubject() );
        if ( teacherInfoDo.getSalary() != null ) {
            teacherInfoPo.setSalary( teacherInfoDo.getSalary().intValue() );
        }
        teacherInfoPo.setAge( teacherInfoDo.getAge() );
        teacherInfoPo.setClassId( teacherInfoDo.getClassId() );
        teacherInfoPo.setClassName( teacherInfoDo.getClassName() );

        return teacherInfoPo;
    }

    protected List<TeacherInfoPo> teacherInfoDoListToTeacherInfoPoList(List<TeacherInfoDo> list) {
        if ( list == null ) {
            return null;
        }

        List<TeacherInfoPo> list1 = new ArrayList<TeacherInfoPo>( list.size() );
        for ( TeacherInfoDo teacherInfoDo : list ) {
            list1.add( teacherInfoDoToTeacherInfoPo( teacherInfoDo ) );
        }

        return list1;
    }
}

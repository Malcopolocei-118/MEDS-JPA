package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.infrastructure.entity.ClassInfoPo;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-18T15:02:09+0800",
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
        List<StudentInfoPo> list = classInfoPo.getStudents();
        if ( list != null ) {
            classInfoDo.setStudents( new ArrayList<StudentInfoPo>( list ) );
        }
        else {
            classInfoDo.setStudents( null );
        }
        List<TeacherInfoPo> list1 = classInfoPo.getTeachers();
        if ( list1 != null ) {
            classInfoDo.setTeachers( new ArrayList<TeacherInfoPo>( list1 ) );
        }
        else {
            classInfoDo.setTeachers( null );
        }

        return classInfoDo;
    }
}

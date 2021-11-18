package com.meds.application.assembler;

import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
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
        classInfoDto.setClassName( classInfoDo.getClassName() );
        classInfoDto.setStudentSize( classInfoDo.getStudentSize() );
        classInfoDto.setTeacherSize( classInfoDo.getTeacherSize() );
        classInfoDto.setClassLevel( classInfoDo.getClassLevel() );
        classInfoDto.setAvgScoreChinese( classInfoDo.getAvgScoreChinese() );
        classInfoDto.setAvgScoreMath( classInfoDo.getAvgScoreMath() );
        classInfoDto.setAvgScoreEnglish( classInfoDo.getAvgScoreEnglish() );
        List<StudentInfoPo> list = classInfoDo.getStudents();
        if ( list != null ) {
            classInfoDto.setStudents( new ArrayList<StudentInfoPo>( list ) );
        }
        else {
            classInfoDto.setStudents( null );
        }
        List<TeacherInfoPo> list1 = classInfoDo.getTeachers();
        if ( list1 != null ) {
            classInfoDto.setTeachers( new ArrayList<TeacherInfoPo>( list1 ) );
        }
        else {
            classInfoDto.setTeachers( null );
        }

        return classInfoDto;
    }
}

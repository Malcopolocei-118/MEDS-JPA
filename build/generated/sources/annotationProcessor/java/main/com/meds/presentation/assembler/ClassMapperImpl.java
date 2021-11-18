package com.meds.presentation.assembler;

import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.common.ClassLevelEnum;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.entity.TeacherInfoPo;
import com.meds.presentation.vo.ClassInfoVo;
import com.meds.presentation.vo.ClassRegisterVo;
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
        List<StudentInfoPo> list = classInfoDto.getStudents();
        if ( list != null ) {
            classInfoVo.setStudents( new ArrayList<StudentInfoPo>( list ) );
        }
        else {
            classInfoVo.setStudents( null );
        }
        List<TeacherInfoPo> list1 = classInfoDto.getTeachers();
        if ( list1 != null ) {
            classInfoVo.setTeachers( new ArrayList<TeacherInfoPo>( list1 ) );
        }
        else {
            classInfoVo.setTeachers( null );
        }

        return classInfoVo;
    }
}

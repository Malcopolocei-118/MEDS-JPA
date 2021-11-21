package com.meds.infrastructure.assembler;

import com.meds.common.GenderEnum;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.infrastructure.entity.ClassInfoPo;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-21T09:57:37+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class ClassMapperImpl implements ClassMapper {

    @Override
    public ClassInfoPo toClassInfoPo(ClassRegisterDo classRegisterDo) {
        if ( classRegisterDo == null ) {
            return null;
        }

        ClassInfoPo classInfoPo = new ClassInfoPo();

        classInfoPo.setClassId( classRegisterDo.getClassId() );
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
        classInfoDo.setClassId( classInfoPo.getClassId() );
        classInfoDo.setClassName( classInfoPo.getClassName() );
        classInfoDo.setStudentSize( classInfoPo.getStudentSize() );
        classInfoDo.setTeacherSize( classInfoPo.getTeacherSize() );
        classInfoDo.setClassLevel( classInfoPo.getClassLevel() );
        classInfoDo.setAvgScoreChinese( classInfoPo.getAvgScoreChinese() );
        classInfoDo.setAvgScoreMath( classInfoPo.getAvgScoreMath() );
        classInfoDo.setAvgScoreEnglish( classInfoPo.getAvgScoreEnglish() );

        return classInfoDo;
    }

    @Override
    public ClassInfoPo toClassInfoPo(ClassInfoDo classInfoDo) {
        if ( classInfoDo == null ) {
            return null;
        }

        ClassInfoPo classInfoPo = new ClassInfoPo();

        classInfoPo.setId( classInfoDo.getId() );
        classInfoPo.setClassId( classInfoDo.getClassId() );
        classInfoPo.setClassName( classInfoDo.getClassName() );
        classInfoPo.setStudentSize( classInfoDo.getStudentSize() );
        classInfoPo.setTeacherSize( classInfoDo.getTeacherSize() );
        classInfoPo.setClassLevel( classInfoDo.getClassLevel() );
        classInfoPo.setAvgScoreChinese( classInfoDo.getAvgScoreChinese() );
        classInfoPo.setAvgScoreMath( classInfoDo.getAvgScoreMath() );
        classInfoPo.setAvgScoreEnglish( classInfoDo.getAvgScoreEnglish() );

        return classInfoPo;
    }
}

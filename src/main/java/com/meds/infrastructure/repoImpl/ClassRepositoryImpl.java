package com.meds.infrastructure.repoImpl;

import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.exception.ExceptionCode;
import com.meds.exception.ManagementExceptionCode;
import com.meds.infrastructure.assembler.ClassMapper;
import com.meds.infrastructure.entity.ClassInfoPo;
import com.meds.infrastructure.repository.ClassRepository;
import com.meds.infrastructure.repository.JpaClassRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ClassRepositoryImpl implements ClassRepository {

    private final JpaClassRepository jpaClassRepository;

    @Override
    public void saveClassInfo(ClassRegisterDo classRegisterDo) {
        ClassInfoPo classInfoPo = ClassMapper.MAPPER.toClassInfoPo(classRegisterDo);
        jpaClassRepository.save(classInfoPo);
    }

    @Override
    public ClassInfoDo findClassById(Long id) {
        Optional<ClassInfoPo> classInfo = jpaClassRepository.findById(id);
        if (!classInfo.isPresent()) {
            throw new ManagementExceptionCode(ExceptionCode.CLASS_NOT_FOUND);
        }
        ClassInfoPo classInfoPo = classInfo.get();
        return ClassMapper.MAPPER.toClassInfoDo(classInfoPo);
    }

    @Override
    public void save(ClassInfoDo classInfoDo) {
        ClassInfoPo classInfoPo = ClassMapper.MAPPER.toClassInfoPo(classInfoDo);
        jpaClassRepository.save(classInfoPo);
    }

    @Override
    public void deleteClassById(Long classId) {
        jpaClassRepository.deleteById(classId);
    }

    @Override
    public ClassInfoDo findClassByClassId(String classId) {
        ClassInfoPo classInfoPo = jpaClassRepository.findByClassId(classId);
        return ClassMapper.MAPPER.toClassInfoDo(classInfoPo);
    }
}

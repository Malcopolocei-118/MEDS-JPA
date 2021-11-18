package com.meds.infrastructure.repoImpl;

import com.meds.domain.student.entity.TeacherInfoDo;
import com.meds.domain.student.entity.TeacherRegisterDo;
import com.meds.infrastructure.assembler.TeacherMapper;
import com.meds.infrastructure.entity.TeacherInfoPo;
import com.meds.infrastructure.repository.JpaTeacherRepository;
import com.meds.infrastructure.repository.TeacherRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class TeacherRepositoryImpl implements TeacherRepository {

    private final JpaTeacherRepository jpaTeacherRepository;

    @Override
    public void saveTeacher(TeacherRegisterDo registerDo) {
        TeacherInfoPo registerPo = TeacherMapper.MAPPER.toTeacherInfoPo(registerDo);
        jpaTeacherRepository.save(registerPo);
    }

    @Override
    public void deleteById(Long id) {
        jpaTeacherRepository.deleteById(id);
    }

    @Override
    public List<TeacherInfoDo> findAllUngrouping(boolean isToClass) {
        List<TeacherInfoPo> teacherInfoPos = jpaTeacherRepository.findAllByGrouped(isToClass);
        return teacherInfoPos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoDo)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherInfoDo findTeacherById(Long id) {
        Optional<TeacherInfoPo> teacherInfo = jpaTeacherRepository.findById(id);
        return TeacherMapper.MAPPER.toTeacherInfoDo(teacherInfo.get());
    }
}

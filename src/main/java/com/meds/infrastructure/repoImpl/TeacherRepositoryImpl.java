package com.meds.infrastructure.repoImpl;

import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.entity.TeacherRegisterDo;
import com.meds.exception.ExceptionCode;
import com.meds.exception.ManagementExceptionCode;
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
        if (!teacherInfo.isPresent()) {
            throw new ManagementExceptionCode(ExceptionCode.TEACHER_NOT_FOUND);
        }
        return TeacherMapper.MAPPER.toTeacherInfoDo(teacherInfo.get());
    }

    @Override
    public void saveTeacherInfo(TeacherInfoDo teacherInfoDo) {
        TeacherInfoPo teacherInfoPo = TeacherMapper.MAPPER.toTeacherInfoPo(teacherInfoDo);
        jpaTeacherRepository.save(teacherInfoPo);
    }

    @Override
    public List<TeacherInfoDo> findAll() {
        List<TeacherInfoPo> teacherInfoPos = jpaTeacherRepository.findAll();
        return teacherInfoPos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoDo)
                .collect(Collectors.toList());
    }

    @Override
    public void saveAll(List<TeacherInfoDo> teacherInfoDos) {
        List<TeacherInfoPo> teacherInfoPos = teacherInfoDos.stream()
                .map(TeacherMapper.MAPPER::toTeacherInfoPo)
                .collect(Collectors.toList());
        jpaTeacherRepository.saveAll(teacherInfoPos);
    }

}

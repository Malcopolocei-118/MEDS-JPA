package com.meds.infrastructure.repoImpl;

import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.entity.StudentRegisterDo;
import com.meds.infrastructure.assembler.StudentMapper;
import com.meds.infrastructure.entity.StudentInfoPo;
import com.meds.infrastructure.repository.JpaStudentRepository;
import com.meds.infrastructure.repository.StudentRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    private final JpaStudentRepository jpaStudentRepository;

    @Override
    public void saveStudent(StudentRegisterDo requestDo) {
        StudentInfoPo registerPo = StudentMapper.MAPPER.toStudentRegisterDo(requestDo);
        jpaStudentRepository.save(registerPo);
    }

    @Override
    public void deleteById(Long studentId) {
       jpaStudentRepository.deleteById(studentId);
    }

    @Override
    public List<StudentInfoDo> findAllUngrouping(Boolean isToClass) {
        List<StudentInfoPo> studentInfoPos = jpaStudentRepository.findAllByGrouped(isToClass);
        return studentInfoPos.stream()
                .map(StudentMapper.MAPPER::toStudentInfoDo)
                .collect(Collectors.toList());
    }

    @Override
    public StudentInfoDo findStudentById(Long id) {
        Optional<StudentInfoPo> studentInfoPo = jpaStudentRepository.findById(id);
        return StudentMapper.MAPPER.toStudentInfoDo(studentInfoPo.get());
    }
}

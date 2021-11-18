package com.meds.application;

import com.meds.application.assembler.ClassMapper;
import com.meds.application.dto.ClassInfoDto;
import com.meds.application.dto.ClassRegisterDto;
import com.meds.domain.classInfo.entity.ClassInfoDo;
import com.meds.domain.classInfo.entity.ClassRegisterDo;
import com.meds.domain.classInfo.service.ClassDomainService;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.service.StudentDomainService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassApplicationService {

    private final ClassDomainService classDomainService;

    private final StudentDomainService studentDomainService;

    public void saveClassInfo(ClassRegisterDto classRegisterDto) {
        ClassRegisterDo classRegisterDo = ClassMapper.MAPPER.toClassRegisterDo(classRegisterDto);
        classDomainService.saveClassInfo(classRegisterDo);
    }

    public ClassInfoDto findClassById(Long id) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(id);
        return ClassMapper.MAPPER.toClassInfoDto(classInfoDo);
    }

    public void groupStudentByClassId(Long classId, Long studentId) {
        ClassInfoDo classInfoDo = classDomainService.findClassById(classId);
        StudentInfoDo studentInfoDo = studentDomainService.findStudentById(studentId);
        classInfoDo.getStudents().add(studentInfoDo);
        classDomainService.save(classInfoDo);
    }
}

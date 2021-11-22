//package com.meds.infrastructure.student;
//
//import com.meds.common.GenderEnum;
//import com.meds.domain.student.entity.StudentInfoDo;
//import com.meds.domain.student.entity.StudentRegisterDo;
//import com.meds.infrastructure.repository.StudentRepository;
//import javax.annotation.Resource;
//import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//import org.springframework.transaction.annotation.Transactional;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(
//        classes = {StudentJpaConfig.class},
//        loader = AnnotationConfigContextLoader.class)
//@Transactional
//public class StudentRepositoryTestJPA {
//
//    @Resource
//    private StudentRepository studentRepository;
//
//    @Test
//    public void save_and_find_student_by_id() {
//        StudentRegisterDo studentRegisterDo = StudentRegisterDo.builder()
//                .studentId("studentId1")
//                .name("studentName1")
//                .age(8)
//                .gender(GenderEnum.MALE)
//                .build();
//        studentRepository.saveStudent(studentRegisterDo);
//
//        StudentInfoDo studentInfoDo = studentRepository.findStudentById(1l);
//
//        assertThat(studentInfoDo.getStudentId()).isEqualTo("studentId1");
//    }
//}

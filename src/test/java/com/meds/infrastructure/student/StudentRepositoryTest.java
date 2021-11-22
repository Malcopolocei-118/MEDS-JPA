package com.meds.infrastructure.student;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.infrastructure.repository.StudentRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

@AutoConfigureMockMvc
@SpringBootTest
@ContextConfiguration
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionDbUnitTestExecutionListener.class,
        MockitoTestExecutionListener.class
})
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    @DatabaseSetup("/dbunit/studentTestSample.xml")
    public void should_get_student_info_id() {

        StudentInfoDo studentInfoDo = studentRepository.findStudentById(1l);

        assertThat(studentInfoDo.getId()).isEqualTo(1l);
        assertThat(studentInfoDo.getStudentId()).isEqualTo("studentId1");
        assertThat(studentInfoDo.getName()).isEqualTo("studentName1");
        assertThat(studentInfoDo.getGender()).isEqualTo("MALE");
    }
}

package com.meds.infrastructure.teacher;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.infrastructure.repository.StudentRepository;
import com.meds.infrastructure.repository.TeacherRepository;
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
public class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    @DatabaseSetup("/dbunit/teacherTestSample.xml")
    public void should_get_teacher_info_by_id() {
        TeacherInfoDo teacherInfoDo = teacherRepository.findTeacherById(1l);

        assertThat(teacherInfoDo.getAge()).isEqualTo(47);
        
    }
}

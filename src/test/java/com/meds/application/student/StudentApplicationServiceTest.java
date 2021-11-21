package com.meds.application.student;

import com.meds.application.StudentApplicationService;
import com.meds.application.dto.StudentInfoDto;
import com.meds.common.GenderEnum;
import com.meds.domain.student.entity.StudentInfoDo;
import com.meds.domain.student.service.StudentDomainService;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentApplicationServiceTest {

    @InjectMocks
    StudentApplicationService studentApplicationService;

    @Mock
    StudentDomainService studentDomainService;

    @Test
    public void should_find_all_ungroup_student() {
        StudentInfoDo studentInfoDo1 = StudentInfoDo.builder()
                .id(1l)
                .name("student1")
                .age(6)
                .gender(GenderEnum.MALE)
                .grouped(false)
                .build();
        StudentInfoDo studentInfoDo2 = StudentInfoDo.builder()
                .id(2l)
                .name("student2")
                .age(7)
                .gender(GenderEnum.MALE)
                .grouped(true)
                .build();
        List<StudentInfoDo> studentInfoDos = Arrays.asList(studentInfoDo1, studentInfoDo2);

        when(studentDomainService.findAllUngrouping()).thenReturn(studentInfoDos);

        List<StudentInfoDto> studentInfoDtoList = studentApplicationService.findAllUngrouping();

        assertThat(studentInfoDtoList.get(0).getId()).isEqualTo(1l);
        assertThat(studentInfoDtoList.get(1).getId()).isEqualTo(2l);
    }

}

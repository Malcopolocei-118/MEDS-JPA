package com.meds.application.teacher;

import com.meds.application.TeacherApplicationService;
import com.meds.application.dto.TeacherInfoDto;
import com.meds.common.GenderEnum;
import com.meds.common.SubjectEnum;
import com.meds.domain.teacher.entity.TeacherInfoDo;
import com.meds.domain.teacher.service.TeacherDomainService;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherApplicationServiceTest {

    @InjectMocks
    TeacherApplicationService teacherApplicationService;

    @Mock
    TeacherDomainService teacherDomainService;

    @Test
    public void should_find_all_ungrouped_teachers() {
        TeacherInfoDo teacherInfoDo1 = TeacherInfoDo.builder()
                .id(1l)
                .teacherName("teacher1")
                .age(40)
                .gender(GenderEnum.MALE)
                .salary(4000)
                .subject(SubjectEnum.CHINESE)
                .build();
        TeacherInfoDo teacherInfoDo2 = TeacherInfoDo.builder()
                .id(2l)
                .teacherName("teacher2")
                .age(45)
                .gender(GenderEnum.MALE)
                .salary(4500)
                .subject(SubjectEnum.MATH)
                .build();
        List<TeacherInfoDo> teacherInfoDos = Arrays.asList(teacherInfoDo1, teacherInfoDo2);

        when(teacherDomainService.findAllUngrouping()).thenReturn(teacherInfoDos);

        List<TeacherInfoDto> teacherInfoDtos = teacherApplicationService.findAllUngrouping();

        assertThat(teacherInfoDtos.get(0).getId()).isEqualTo(1l);
        assertThat(teacherInfoDtos.get(1).getId()).isEqualTo(2l);
    }

}

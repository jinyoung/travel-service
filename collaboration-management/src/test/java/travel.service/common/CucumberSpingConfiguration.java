package travel.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import travel.service.CollaborationManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CollaborationManagementApplication.class })
public class CucumberSpingConfiguration {}

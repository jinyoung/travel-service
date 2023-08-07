package travel.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import travel.service.PartnershipManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PartnershipManagementApplication.class })
public class CucumberSpingConfiguration {}

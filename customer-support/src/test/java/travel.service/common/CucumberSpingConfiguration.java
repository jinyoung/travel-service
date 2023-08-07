package travel.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import travel.service.CustomerSupportApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerSupportApplication.class })
public class CucumberSpingConfiguration {}

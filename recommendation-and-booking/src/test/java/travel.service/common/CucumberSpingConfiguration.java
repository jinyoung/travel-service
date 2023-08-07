package travel.service.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import travel.service.RecommendationAndBookingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RecommendationAndBookingApplication.class })
public class CucumberSpingConfiguration {}

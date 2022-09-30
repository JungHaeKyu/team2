package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.ServiceApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ServiceApplication.class })
public class CucumberSpingConfiguration {}

package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.RequestApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { RequestApplication.class })
public class CucumberSpingConfiguration {}

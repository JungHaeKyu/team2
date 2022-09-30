package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.ViewApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ViewApplication.class })
public class CucumberSpingConfiguration {}

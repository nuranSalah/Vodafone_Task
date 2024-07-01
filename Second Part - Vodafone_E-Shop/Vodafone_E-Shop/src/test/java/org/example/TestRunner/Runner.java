package org.example.TestRunner;
        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Features",
                glue = {"org/example/StepDefinations"},
                tags = "@smoke"
        )

public class Runner extends AbstractTestNGCucumberTests {}
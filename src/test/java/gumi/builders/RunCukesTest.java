package gumi.builders;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report", "pretty:target/cucumber-json-report.json"})
public class RunCukesTest {
}
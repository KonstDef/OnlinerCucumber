package onliner.tests;

import framework.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/onliner/features/navigation.feature",
        glue = "onliner/steps",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                "json:target/cucumber-reports/CucumberTestReport.json"}
)
public class NavigationTest extends CucumberBaseTest {
}

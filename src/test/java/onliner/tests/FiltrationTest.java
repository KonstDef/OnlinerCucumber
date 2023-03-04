package onliner.tests;

import framework.CucumberBaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/onliner/features/filtration.feature",
        glue = "onliner/steps",
        plugin = {"pretty","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)
public class FiltrationTest extends CucumberBaseTest {
}

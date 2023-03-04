package onliner.steps;

import framework.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

@Log4j2
public class BaseSteps {
    @After
    public void takeScreenShotAfterStep(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Browser.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/jpg", scenario.getName());
        }
    }
}

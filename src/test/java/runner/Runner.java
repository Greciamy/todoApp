package runner;

import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import sessionManager.Session;

import java.net.MalformedURLException;

@RunWith(Cucumber.class)
public class Runner {

    @Before
    public void beforeCucumber() {
        System.out.println("BEFORE CUCUMBER");
    }

    @After
    public void afterCucumber(Scenario scenario) throws MalformedURLException {
        if (scenario.isFailed()) {
            byte [] screenShoot = Session.getInstance().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShoot, "image/png");
        }
        System.out.println("AFTER CUCUMBER");
        Session.getInstance().closeSession();
    }
}

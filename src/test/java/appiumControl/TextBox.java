package appiumControl;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class TextBox extends  Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value);
    }
}

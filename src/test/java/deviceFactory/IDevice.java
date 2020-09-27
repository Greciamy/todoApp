package deviceFactory;


import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public interface IDevice {
       AppiumDriver create() throws MalformedURLException;
}

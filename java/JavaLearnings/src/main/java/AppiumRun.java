import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumRun {


    public static void main(String[] args) throws MalformedURLException {

        firstTest();
    }

    static void firstTest() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("platformVersion", "12.6");
        dc.setCapability("deviceName", "iPhone 14");

        URL url = new URL("http://localhost:4723/wd/hub");

        IOSDriver iosDriver = new IOSDriver(url, dc);

    }
}

package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase

{

    @Test
    public void firstiOSTest() throws MalformedURLException {



        System.out.println("hello");

        DesiredCapabilities dc = new DesiredCapabilities();

        /*
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 13");

        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");


        dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.2");

         */

      //  dc.setCapability("app", "com.myproject");
        dc.setCapability(CapabilityType.PLATFORM_NAME, "iOS");
        dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");

        dc.setCapability(MobileCapabilityType.UDID, "34727E11-7BA3-4384-9D18-A1AF6F589D00");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");


        WebDriver driver = new AppiumDriver(url, dc);

        driver.get("https://www.google.com");

        


    }



}

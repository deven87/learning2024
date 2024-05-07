import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;

public class FileDownload {


    /**
     * locator emailField.
     **/
    @FindBy(css = "input[type='email']")
    private static  WebElement emailField;

    /**
     * locator passwordField.
     **/
    @FindBy(css = "input[type='password']")
    private static  WebElement passwordField;

    /**
     * locator forgetPasswordLink.
     **/
    @FindBy(css = ".forget-link")
    private static  WebElement forgetPasswordLink;

    /**
     * locator loginButton.
     **/
    @FindBy(css = "[id='submit_button']")
    private static  WebElement loginButton;

    public static final String AUTOMATE_USERNAME = "devendrasingh19";
    public static final String AUTOMATE_KEY = "PzJeRHsb5r4aWKbNwToD";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("browserVersion", "latest");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("os", "Windows");
        browserstackOptions.put("osVersion", "10");
        browserstackOptions.put("projectName", "Bstack-[Java] Sample file download");
        capabilities.setCapability("bstack:options", browserstackOptions);

        WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        PageFactory.initElements(driver, FileDownload.class);


        driver.get("https://app.resumebuilder.com/login");
        Thread.sleep(2000);

        emailField.sendKeys("avnishlive16@yopmail.com");
        passwordField.sendKeys("Stripes39!");

        loginButton.click();

        Thread.sleep(10000);

        driver.findElement(By.cssSelector(".toggle-action-list")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".active-button-list .icon-file-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".button-area .skip")).click();

        Thread.sleep(20000);

        // Check if file exists
     //   System.out.println(jse.executeScript("browserstack_executor: {\"action\": \"fileExists\", \"arguments\": {\"fileName\": \"BrowserStack - List of devices to test on.csv\"}}"));

        // Get file properties

        System.out.println("validate if file exist based on file type pdf");
        System.out.println(jse.executeScript("browserstack_executor: {\"action\": \"fileExists\", \"arguments\": {\"fileType\": \"pdf\"}}"));

        System.out.println("validate if file exist based on file name partial");

        System.out.println(jse.executeScript("browserstack_executor: {\"action\": \"fileExists\", \"arguments\": {\"fileName\": \"resume-\"}}"));

        System.out.println("validate if old file exist based on file name");

        System.out.println(jse.executeScript("browserstack_executor: {\"action\": \"fileExists\", \"arguments\": {\"fileName\": \"resume-1697171697945.pdf\"}}"));


        System.out.println(jse.executeScript("browserstack_executor: {\"action\": \"getFileProperties\", \"arguments\": {\"fileType\": \"pdf\"}}"));

        // Get file content. The content is Base64 encoded
        String base64EncodedFile = (String) jse.executeScript("browserstack_executor: {\"action\": \"getFileContent\", \"arguments\": {\"fileType\": \"pdf\"}}");


        Object content =jse.executeScript("browserstack_executor: {\"action\": \"getFileProperties\", \"arguments\": {\"fileType\": \"pdf\"}}");

        String[] myFileContent = content.toString().split(",");

        for (int i = 0; i<myFileContent.length; i++) {

            System.out.println(myFileContent[i]);

            if(myFileContent[i].contains("size")) {

                int size =Integer.parseInt(myFileContent[i].replaceAll("[^0-9]", ""));
                if(size<10000) {

                    System.out.println("fail the test as file size is not correct, it may be blank");
                }

            }


            if(myFileContent[i].contains("created_time")) {

                String date =myFileContent[i].replaceAll("[^0-9]", "");



                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy:hh:mm:ss");

                long milliSeconds= Long.parseLong(date);
                System.out.println(milliSeconds);

                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(milliSeconds);
                System.out.println(formatter.format(calendar.getTime()));


            }



        }




        // Decode the content to Base64
        byte[] data = Base64.getDecoder().decode(base64EncodedFile);
        OutputStream stream = new FileOutputStream("BrowserStack%20-%20List%20of%20devices%20to%20test%20on.csv");
        stream.write(data);
        stream.close();


       // System.out.println(Arrays.toString(data));

        driver.quit();
    }
}

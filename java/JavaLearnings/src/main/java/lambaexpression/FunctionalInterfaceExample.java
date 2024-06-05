package lambaexpression;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        int i = 10;

        driver.get("https://theautomationzone.blogspot.com/2022/08/dynamic-elements-synchronization.html");

        WebElement smallDelayButton = driver.findElement(By.xpath("//button[text()='Show Message with small delay']"));

        WebElement disableButton = driver.findElement(By.xpath("//button[text()='Show Message with small delay']"));

        smallDelayButton.click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(1)).withTimeout(Duration.ofSeconds(20))
                .ignoring(NoSuchElementException.class).ignoring(ElementNotInteractableException.class);

/*

        fluentWait.until(

                // implementing functional interface (name of interface is Function<T, R>) using annonymous class
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver webDriver) {

                        WebElement element = driver.findElement(By.xpath("//p[text()='This message is shown with small delay']"));

                        element.click();

                        return element;
                    }
                }
        );
        */

        fluentWait.until(
                webDriver -> {

                    System.out.println("waiting for element");

                    WebElement element = webDriver.findElement(By.xpath("//p[text()='This message is shown with small delay']"));

                    System.out.println("Clicking on element");

                    element.click();

                    System.out.println("Returning element");

                    return element;
                });

        Function<WebDriver, WebElement> fun = webDriver -> {

            WebElement element = driver.findElement(By.xpath("//p[text()='This message is shown with small delay']"));

            element.click();

            System.out.println(i);

            return element;
        };

        fun.apply(driver);

    }





}

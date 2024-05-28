package lambaexpression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lambda5 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();


        driver.get("https://www.intelligent.com/");

        driver.findElement(By.xpath("//h1[text()='Learning how to Learnasd2oiu312oi3 ']"));


    }
}

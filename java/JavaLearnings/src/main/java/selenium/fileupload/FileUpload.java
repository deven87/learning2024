package selenium.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {


    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();


        /*
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/intelligent/Desktop/image.png");

         */

        driver.get("https://blueimp.github.io/jQuery-File-Upload/");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();


        Robot robot = new Robot();

        StringSelection s = new StringSelection("/Users/intelligent/Desktop/image.png");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

        // Use Robot class to navigate and select the file in the dialog
        robot.keyPress(KeyEvent.VK_META); // Command key
        robot.keyPress(KeyEvent.VK_V); // V key
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        Thread.sleep(1000); // Adding a short delay to ensure the file path is pasted
        robot.keyPress(KeyEvent.VK_ENTER); // Press Enter to confirm file selection
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}

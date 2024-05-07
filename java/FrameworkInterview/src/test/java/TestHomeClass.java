import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomeClass extends Base{

    @Test
    void openHomePage() throws IOException {

        ExtentTest test = ExtentReportClass.getReport().createTest(
                "my first test", "my test descriptions");

        test.log(Status.INFO, "info");
        test.log(Status.PASS, "Pass");
        test.log(Status.FAIL, "fail");
        test.fail("as");
      //  test.fail((Markup) MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

        MyLog.printLogInfo("my log");
    }
}

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base {



    @BeforeSuite
    void beforeSuite() {

        System.out.println("Starting report");

        ExtentReportClass.startReport();
    }


    @AfterSuite
            void afterSuite() {

        System.out.println("flushing report");
        ExtentReportClass.flushReport();
        System.out.println(ExtentReportClass.getRunTime());

    }
}

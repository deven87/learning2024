import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentAventReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClass {

    static ExtentSparkReporter extentReporter;
    static ExtentReports extentReports;



    public static void startReport() {

        extentReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/report.html");




        extentReports = new ExtentReports();

        extentReports.attachReporter(extentReporter);

        extentReporter.config().setTheme(Theme.DARK);

        extentReporter.config().setReportName("htmlreport");


    }

    public static long getRunTime() {

        return extentReporter.getRunDuration();
    }

    public static ExtentReports getReport() {

        return extentReports;
    }

    public static void flushReport() {

        extentReports.flush();
    }

}

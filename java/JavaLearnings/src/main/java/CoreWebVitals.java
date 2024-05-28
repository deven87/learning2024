import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v121.performance.Performance;
import org.openqa.selenium.devtools.v121.performance.model.Metric;

import java.util.List;
import java.util.Optional;

public class CoreWebVitals {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable

        // Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the target website
        driver.get("https://www.intelligent.com");
        // Wait for a while to let the page load and collect metrics
        try {
            Thread.sleep(10000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create a DevTools session
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();

        // Enable the Performance domain
        devTools.send(Performance.enable(Optional.empty()));



        // Retrieve the performance metrics
        List<Metric> metrics = devTools.send(Performance.getMetrics());

        // Extract Core Web Vitals
        double lcp = 0;
        double fid = 0;
        double cls = 0;

        for (Metric metric : metrics) {
            switch (metric.getName()) {
                case "LargestContentfulPaint":
                    lcp = (double) metric.getValue();
                    break;
                case "FirstInputDelay":
                    fid = (double) metric.getValue();
                    break;
                case "CumulativeLayoutShift":
                    cls = (double) metric.getValue();
                    break;
            }
        }

        // Print the Core Web Vitals
        System.out.println("Core Web Vitals:");
        System.out.println("Largest Contentful Paint (LCP): " + lcp);
        System.out.println("First Input Delay (FID): " + fid);
        System.out.println("Cumulative Layout Shift (CLS): " + cls);

        // Close the browser
        driver.quit();
    }
}
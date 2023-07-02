package core.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.codec.CharEncoding;

public class ExtentManager {

    public static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

        htmlReporter.config().setEncoding(CharEncoding.UTF_8);
        htmlReporter.config().setDocumentTitle("RJB Automation Report");
        htmlReporter.config().setReportName("Automation Test Results");
        htmlReporter.config().setTheme(Theme.DARK);

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Automation Tester", "RJB");
        extent.setSystemInfo("Build Number", "12345");
        extent.setSystemInfo("Something Cool", "Cool Story Bro");

        return extent;
    }
}

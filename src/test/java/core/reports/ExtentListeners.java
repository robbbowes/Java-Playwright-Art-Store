//package core.reports;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import org.testng.ISuite;
//import org.testng.ISuiteListener;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.util.Date;
//
//public class ExtentListeners implements ITestListener, ISuiteListener {
//
//    private static ExtentTest test;
//    private static final String FILE_NAME = "Extent_" + new Date().toString()
//            .replace(":", "_")
//            .replace(" ", "_")
//            + ".html";
//    private static final ExtentReports EXTENT = ExtentManager.createInstance("./reports/" + FILE_NAME);
//
//    @Override
//    public void onTestStart(ITestResult result) {
//        test = EXTENT.createTest(result.getTestClass().getName() + " @TestCase: " + result.getMethod().getMethodName());
//        ITestListener.super.onTestStart(result);
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        String name = result.getMethod().getMethodName();
//        test.pass(MarkupHelper.createLabel("Test passed: " + name, ExtentColor.GREEN));
//        ITestListener.super.onTestSuccess(result);
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        String name = result.getMethod().getMethodName();
//        test.fail(MarkupHelper.createLabel("Test failed: " + name, ExtentColor.RED));
//        ITestListener.super.onTestFailure(result);
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        String name = result.getMethod().getMethodName();
//        test.skip(MarkupHelper.createLabel("Test skipped: " + name, ExtentColor.BLUE));
//        ITestListener.super.onTestSkipped(result);
//    }
//
//    @Override
//    public void onFinish(ISuite suite) {
//        if (EXTENT != null) {
//            EXTENT.flush();
//        }
//        ISuiteListener.super.onFinish(suite);
//    }
//
//    public static ExtentTest getTest() {
//        return test;
//    }
//}
//

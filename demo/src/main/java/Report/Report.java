package Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;

public class Report {
    private static final ExtentReports extent = ReportFactory.getInstance();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
    private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
    
    public static void creatTask(String taskName, ReportType type) {
        if(type.equals(ReportType.SINGLE)) {
            ExtentTest extentTest = extent.createTest(taskName);
            test.set(extentTest);
            return;
        }
        ExtentTest extentTest = extent.createTest(taskName);
        parentTest.set(extentTest);
    }
    public static void createStep(String stepName) {
        try {
            ExtentTest child = parentTest.get().createNode(stepName);
            test.set(child);
        } catch (NullPointerException e) {
            e.getStackTrace();
        }
    }
    private static boolean instanceDoesntExist() {
        if(test==null) {
            return true;
        }else {
            return false;
        }
    }
    public static void log(Status status, String mensage, Media capture) {
        if(instanceDoesntExist()) {
            return;
        }else {
            test.get().log(status, mensage, capture);
        }
    }
    public static void close() {
        if(instanceDoesntExist()) {
            return;
        }else {
            extent.flush();
        }
    }
}

package Report;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Framework.Utils.CreateFolder;
import Framework.Utils.DateTime;

public class ReportFactory {
    public WebDriver driver;
    
    public static final String PATH_REPORT= System.getProperty("user.dir")+ File.separator+"Report"+File.separator+"Report_"+DateTime.getDateTimeFormatReport();
    
    public static ExtentSparkReporter extentSparkReport;
    public static ExtentReports extentReports;
    public static void configReportExtent() {
        CreateFolder.createFolderReport(PATH_REPORT);
        extentSparkReport = new ExtentSparkReporter(PATH_REPORT + File.separator+"Report_"+DateTime.getDateTimeFormatReport()+".html");
        extentSparkReport.config().setDocumentTitle("Relatorio de execução: Automação/Capacitação");
        extentSparkReport.config().setReportName("Relatório de execução de testes");
        extentSparkReport.config().setTheme(Theme.STANDARD);
        extentSparkReport.config().setEncoding("UTF-8");
        extentSparkReport.config().setTimeStampFormat("EEEE , MMMM dd, yyyy , hh:mm a '('zzz')'");
        extentSparkReport.config().setCss(".nav-wrapper { background-color: #4B0082 !important; } .nav-logo{margin-top: 10px;}.brand-logo { background-color: #4B0082 !important; padding: 0 10px 0 0 !important; margin: 0 !important; position: absolute !important } .report-name { margin-left: 80px !important } .blue.darken-3 { background-color:#4B0082 !important; color: #FFF !important;}");
        //extentSparkReport.config().setJs("$('.nav-logo').html('<img src=\"https://i.imgur.com/HkrrWKH.png\" class=\"banri-logo\"/>');");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReport);
    }
    protected synchronized static ExtentReports getInstance() {
        if(extentReports==null) {
            configReportExtent();
        }
        return extentReports;
    }
}

package techproed.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class Listeners implements ITestListener {
    //    ITestListener is an interface. We use it for customizing testng framework
//    onStart, onFinish, onTestStart, onTestSkipped, onTestSuccess, onTestFailure
//    These method named must be exactly the same, otherwise Listeners will not listen a method with a different name
//   Listeners are used for customizing based on specific conditions such as when a test fails or passes
    public void onStart(ITestContext arg){
//        Like BeforeSuite
        System.out.println("onStart - Execute once BEFORE all tests = > "+arg.getName());
    }

    public void onFinish(ITestContext arg){
//        Like AfterSuite
        System.out.println("onFinish - Execute once AFTER all tests = > "+arg.getName());
    }
    public void onTestStart(ITestResult arg0){
        System.out.println("onTestStart - Execute before EACH @Test = > "+arg0.getName());
    }
    public void onTestSuccess(ITestResult arg0){
        System.out.println("onTestSuccess - Execute AFTER EACH PASSED @Test = > "+arg0.getName());
    }
    public void onTestSkipped(ITestResult arg0){
        System.out.println("onTestSkipped - Execute AFTER EACH SKIPPED @Test = > "+arg0.getName());
    }
    public void onTestFailure(ITestResult arg0){
//        We can add any java code that we want to run ONLY AFTER A TEST CASE FAILS
//        We can get screenshot automatically when a test case fails
        System.out.println("onTestFailure - Execute AFTER EACH FAILED @Test = > "+arg0.getName());

        try {
            ReusableMethods.getScreenshot(arg0.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }

}
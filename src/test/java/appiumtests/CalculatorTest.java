package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities desiredCap = new DesiredCapabilities();
		//desiredCap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ayan\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.5.5.apk" );
		desiredCap.setCapability("deviceName", "MANISH Nokia");
		desiredCap.setCapability("udid", "DRGID18092004265");
		desiredCap.setCapability("platformName", "Android");
		desiredCap.setCapability("platformVersion", "10");
		desiredCap.setCapability("appPackage", "com.google.android.calculator");
		desiredCap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, desiredCap);
		
		System.out.println("Application Started");
	}

}

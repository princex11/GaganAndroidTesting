package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseCalc {
    public static AppiumDriver appiumDriver;
    Properties properties = new Properties();

    public BaseCalc() {
        try {
            FileInputStream
                    configFile = new FileInputStream("C:\\Users\\Prince\\eclipse-workspace\\GaganAndroidTesting\\src\\test\\java\\environmentVariables\\config.properties");
            properties.load(configFile);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initSetUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, properties.getProperty("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, properties.getProperty("platformVersion"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, properties.getProperty("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, properties.getProperty("udid"));
        desiredCapabilities.setCapability("appPackage", properties.getProperty("appPackage"));
        desiredCapabilities.setCapability("appActivity", properties.getProperty("appActivity"));

        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        appiumDriver = new AndroidDriver<MobileElement>(url, desiredCapabilities);
    }

}

package pom;

import base.BaseCalc;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHome extends BaseCalc {

    public void oneBtnClick(){
        appiumDriver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01")).click();
    }
}

package testing;

import base.BaseCalc;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.PomHome;

public class TestCalcHomePage extends BaseCalc {

    PomHome pomHome;

    public TestCalcHomePage() {
        super();
    }

    @BeforeTest
    public void initSetup() {
       initSetUp();
       pomHome = new PomHome();
    }

    @Test
    public void clickPlusMinusBtn(){
        pomHome.oneBtnClick();
    }


}

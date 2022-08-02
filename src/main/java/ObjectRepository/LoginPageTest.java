package ObjectRepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest
{
//    @FindBy(xpath = "//android.widget.TextView[@text='English']")
//    private MobileElement tv_English;
//
//    @FindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
//    private MobileElement continuebtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Log In']")
    private MobileElement loginbtn;

    @FindBy(xpath="//android.widget.EditText[@text='Email or mobile no']")
    private MobileElement mobilenumber;

    @FindBy(xpath="//android.widget.TextView[@text='NEXT']")
    private MobileElement nextbtn;

    public LoginPageTest(AppiumDriver driver)
    {
        WebDriver AppiumFieldDecorator = null;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

//    public MobileElement getTv_English() {
//        return tv_English;
//    }
//
//    public MobileElement getContinuebtn() {
//        return continuebtn;
//    }

    public MobileElement getLoginbtn() {
        return loginbtn;
    }

    public MobileElement getMobilenumber() {
        return mobilenumber;
    }

    public MobileElement getNextbtn() {
        return nextbtn;
    }

    public void loginPageTest()
    {
//        tv_English.click();
//        continuebtn.click();
        loginbtn.click();
        mobilenumber.sendKeys("7204561040");
        nextbtn.click();
    }
}

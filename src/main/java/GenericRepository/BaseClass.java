package GenericRepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass
{
    public AppiumDriverLocalService server;
    public AppiumDriver driver;

    public DesiredCapabilities dc;++

    public void connectToDB()
    {
        System.out.println("DataBase Connection Sucessfully");
    }
    @BeforeSuite
    public void startServer()
    {
        server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723));
        server.start();
    }
    @BeforeClass
    public void lanuchApplication() throws MalformedURLException {
         dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy M31");
        dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        dc.setCapability("AppPackage","com.app.dream11Pro");
        dc.setCapability("AppActivity","com.app.dream11.dream11.SplashActivity");
        dc.setCapability("noReset","true");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url,dc);
    }
    @AfterMethod
    public void closeapp()
    {
        driver.closeApp();
    }
    @AfterClass
    public void closeserver()
    {
        server.stop();
    }
    @AfterSuite
    public void closeDbConnection()
    {
        System.out.println("close the db connection");
    }
}

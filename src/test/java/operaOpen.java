import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Created by PTL_PC on 9/10/2017.
 */
public class operaOpen {


    @Test
    public void OPenOperaBrowser() {
       // WebDriver driver;
     //   System.setProperty("webdriver.opera.driver", "drivers/operadriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.opera(); //in this command opera is stroked.
//        capabilities.setCapability("opera.binary", "C:\\Program Files\\Opera\\launcher.exe");
//        driver = new OperaDriver(capabilities);
//        driver.get("www.google.com");

//
//        DesiredCapabilities capabilities = new DesiredCapabilities.opera();
//        capabilities.setCapability("opera.binary", "/path/to/your/opera");
//        capabilities.setCapability("opera.log.level", "CONFIG");
//        WebDriver driver = new OperaDriver(capabilities);
//        System.setProperty("webdriver.chrome.driver", "drivers/operadriver.exe");
//        driver =new ChromeDriver();

//        DesiredCapabilities capabilities = DesiredCapabilities.opera();
//        capabilities.setCapability("opera.binary", "C:\\Program Files\\Opera\\launcher.exe");
//        driver = new OperaDriver(capabilities);

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Opera\\launcher.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }

}

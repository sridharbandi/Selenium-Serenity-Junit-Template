package driverutil;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory implements DriverSource {

    @Override
    public WebDriver newDriver() {
        WebDriver _driver = null;
        String _browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
        DriverType _driverType = DriverType.valueOf(_browserName);
        switch (_driverType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                _driver = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                _driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                _driver = new EdgeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                _driver = new InternetExplorerDriver();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                _driver = new OperaDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                _driver = new ChromeDriver();
                break;
        }
        _driver.manage().window().maximize();
        return _driver;

    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

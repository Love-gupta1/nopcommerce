package Test;
import com.beust.jcommander.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import lovePages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class Baseclass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    public static void setup(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        pageFactory = new PageFactory(driver);
    }
    public void close(){
        driver.close();


    }
   // @Parameters("browserName")
    @BeforeClass
    public static void setup(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = WebDriverManager.chromedriver().create();
            driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);
        }

    }
}

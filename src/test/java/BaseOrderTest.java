import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.MainOrderPage;
import steps.OrderStepsPage;

public class BaseOrderTest {
    WebDriver driver ;
    protected MainOrderPage mainOrderPage;
    protected OrderStepsPage orderStepsPage ;

    @Before

    public void start() {

       WebDriverManager.chromedriver().setup();  // Должно быть перед созданием драйвера
      driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
      //  driver= new FirefoxDriver();
        mainOrderPage = new MainOrderPage(driver);
        orderStepsPage = new OrderStepsPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}






















    //@Before
   // public void start() {

       // String browser = System.getProperty("browser", "chrome");
       // if (browser.equals("chrome")) {
        //    startBrowserChrome();
       // } else if (browser.equals("firefox")) {
       //     startBrowserFirefox();
       // }
      //  mainOrder = new MainOrderPage(driver);
      //  orderSteps = new OrderStepsPage(driver);
   // }
    //public void startBrowserFirefox () {
       // WebDriverManager.firefoxdriver().setup();
       // driver = new FirefoxDriver();
   // }
   // public void startBrowserChrome() {

      //  WebDriverManager.chromedriver().setup();
      //  driver= new ChromeDriver();
  //  }
  //  @After
  //  public void tearDown() {
        // Закрыть браузер
    //    driver.quit();
  //  }
//}






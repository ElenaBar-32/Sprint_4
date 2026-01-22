import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.MainOrderPage;
import page.MainQuestionPage;
import steps.OrderStepsPage;

public class BaseOrderTest {
    WebDriver driver ;
    protected MainOrderPage mainOrderPage;
    protected OrderStepsPage orderStepsPage ;
    protected MainQuestionPage mainQuestionPage;
    @Before

    public void start() {

       WebDriverManager.chromedriver().setup();  // Должно быть перед созданием
      driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
      // driver= new FirefoxDriver();
        mainOrderPage = new MainOrderPage(driver);
        orderStepsPage = new OrderStepsPage(driver);
        mainQuestionPage = new MainQuestionPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
























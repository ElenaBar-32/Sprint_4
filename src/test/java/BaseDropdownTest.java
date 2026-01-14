import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.MainQuestionPage;


public class BaseDropdownTest {
    protected WebDriver driver;
    protected MainQuestionPage mainQuestionPage;

    @Before

    public void start() {

        WebDriverManager.chromedriver().setup();  // Должно быть перед созданием драйвера
        driver = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
       // driver= new FirefoxDriver();
        mainQuestionPage = new MainQuestionPage(driver);

    }


    @After
    public void tearDown() {
        driver.quit();
    }
}



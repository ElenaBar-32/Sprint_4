package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainQuestionPage {

    private WebDriver driver;

    private  final By cookieButton = By.className("App_CookieButton__3cvqF");
    private  final By listQuestions = By.className("accordion");    // список  вопросов
    private  final By questionButton = By.className("accordion__button");  // кнопки  вопросов  accordion__button                                                                    private  By buttonText = By.id("email");   //название кнопки
    private  final By answerPanel = By.className("accordion__panel"); // панель с ответами
    private  final String URL = "https://qa-scooter.praktikum-services.ru/";

    public MainQuestionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public String checkAnswer(int index) {
     clickQuestionButton(index);// возвращаем String
       new WebDriverWait(driver, Duration.ofSeconds(3))
              .until(ExpectedConditions.visibilityOf(driver.findElements(answerPanel).get(index)));

        return driver.findElements(answerPanel)
               .get(index)
              .getText();
   }

    public void clickQuestionButton(int index) {
       driver.findElements(questionButton)
              .get(index)
               .click();
   }

    public void openPage() {
        driver.get(URL);

    }
}


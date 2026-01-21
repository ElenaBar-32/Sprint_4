

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class OrderTest extends BaseOrderTest {



    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String telephone;
    private final String data;
    private final String rentDropdownOption ;
    private final String scooterColor;
    private final String comment;

    public OrderTest(String name, String lastName, String address,
                     String metroStation, String telephone, String data, String rentDropdownOption ,String scooterColor,
                     String comment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.data= data;
        this.rentDropdownOption = rentDropdownOption ;
        this.scooterColor = scooterColor;
        this.comment= comment;
    }
    // Тестовые данные
    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {"Иван", "Иванов", "Павелецкая площадь, дом 3", "Павелецкая", "+79206001111","24.12.2023", "сутки","black", "Позвонить за час"},
                {"Петр", "Петров", "пл. Тверская Застава, 2", "Белорусская", "+79206002026","25.12.2023", "трое суток", "grey",  ""}
        };
    }
    @Test
    public void buttonOrderTest() {
        mainQuestionPage.openPage();
        mainQuestionPage.clickCookieButton();
      orderStepsPage.clickOrder(name, lastName, address, metroStation, telephone);
      orderStepsPage.clickNext();
      orderStepsPage.rentSteps(data, scooterColor,comment);
      orderStepsPage.getOrderConfirmation();
      orderStepsPage.clickYesButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderCreatedField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_ModalHeader__3FDaJ")));
        assertTrue("Заказ не оформлен", orderCreatedField.getText().contains("Заказ оформлен"));

    }
    @Test
    public void buttonOrderTest2 () {
        mainQuestionPage.openPage();
        mainQuestionPage.clickCookieButton();
      orderStepsPage.clickOrderButton2();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement whoScooterFor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Header__BZXOb")));

        assertTrue("Страница Для кого самокат  не найдена", whoScooterFor.getText().contains("Для кого самокат"));
    }
}






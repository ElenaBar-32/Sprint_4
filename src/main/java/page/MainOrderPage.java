package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainOrderPage {
    protected WebDriver driver;

    //переменные кнопки Заказать

    private final By orderButton2 = By.xpath(".//button[contains(@class, 'Button_Middle') and text() = 'Заказать']");
    private final By whoScooterFor = By.className("Order_Header__BZXOb"); // переменная используется в OrdserTest
    private final By orderButton = By.className("Button_Button__ra12g");
    private final By nameField = By.cssSelector("input[placeholder='* Имя']");
    private final By lastNameField = By.cssSelector("input[placeholder='* Фамилия']");
    private final By addressField = By.cssSelector("input[placeholder='* Адрес: куда привезти заказ']");
    private final By metroStationField = By.cssSelector("input[placeholder='* Станция метро']");
    private final By dropdownMenuList = By.xpath(".//div[@class='select-search__select']");
    private final By telephoneField = By.cssSelector("input[placeholder='* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath(".//button[text()='Далее']");

    // переменные  аренды
    private final By dataField = By.cssSelector("input[placeholder='* Когда привезти самокат']");
    private final By datepickerPopperList = By.className("react-datepicker-popper");
    private final By rentalPeriodField = By.className("Dropdown-placeholder");
    private final By rentDropdownOption = By.className("Dropdown-option");
    private final By scooterColorField = By.className("Checkbox_Input__14A2w");
    private final By commentField = By.cssSelector("input[placeholder='Комментарий для курьера']");
    private final By orderConfirmationField = By.xpath(".//button[contains(@class, 'Button_Middle') and text() = 'Заказать']");
    private final By yesButton = By.xpath(".//button[contains(@class, 'Button_Middle') and text() = 'Да']");
    private final By orderCreatedField = By.className("Order_ModalHeader__3FDaJ"); // переменная используется в OrdserTest



    //методы Заказать
    public MainOrderPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void fillingFields(String name, String lastName, String address, String metroStation, String telephone) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(metroStationField).sendKeys(metroStation);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(dropdownMenuList));
        driver.findElement(dropdownMenuList).click();
        driver.findElement(telephoneField).sendKeys(telephone);

    }

    public void clickNext() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButtonElement.click();
    }
    // методы аренды

    public void fillingOutRentalFields(String data, String ScooterColor, String comment) {
        driver.findElement(dataField).sendKeys(data);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(datepickerPopperList));
        driver.findElement(datepickerPopperList).click();
        driver.findElement(rentalPeriodField).click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(rentDropdownOption));
        driver.findElement(rentDropdownOption).click();
        driver.findElement(scooterColorField).sendKeys(ScooterColor);
        driver.findElement(commentField).sendKeys(comment);

}
    public void getOrderConfirmation() {
        driver.findElement(orderConfirmationField).click();
    }
    public void clickYesButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(yesButton));
        driver.findElement(yesButton).click();

    }

    //метод второй кнопки Заказать
    public void clickOrderButton2() {
        driver.findElement(orderButton2).click();
    }
}







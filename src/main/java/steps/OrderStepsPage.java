package steps;

import org.openqa.selenium.WebDriver;
import page.MainOrderPage;

public class OrderStepsPage extends MainOrderPage {

   // private WebDriver driver;

    public OrderStepsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOrder (String name, String lastName, String address, String metroStation, String telephone) {
        //методы Заказать
        openPage();
        clickCookieButton ();
        clickOrderButton();
        setName(name);
        setLastName(lastName);
        setAddress(address);
        setMetroStation(metroStation);
        setTelephone(telephone);
        clickNext();
    }
        public void rentSteps(String data,String dropdownOption,String scooterColor, String comment){
            // методы аренды
            setData(data);
            setRentalPeriod(dropdownOption);
            setScooterColor(scooterColor);
            setComment(comment);
            getOrderConfirmation();
            clickYesButton();
            getOrderCreatedField();
        }
    public void clickOrder2 () {
        openPage();
        clickCookieButton ();
        clickOrderButton2();
    }
    }

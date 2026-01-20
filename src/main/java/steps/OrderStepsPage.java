package steps;

import org.openqa.selenium.WebDriver;
import page.MainOrderPage;

public class OrderStepsPage extends MainOrderPage {


    public OrderStepsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOrder (String name, String lastName, String address, String metroStation, String telephone) {
        //методы Заказать
        clickOrderButton();
        fillingFields (name,lastName,address,metroStation,telephone);
    }
        public void rentSteps(String data,String dropdownOption,String scooterColor, String comment){
            // методы аренды
            fillingOutRentalFields (data,dropdownOption,scooterColor, comment);

        }
    }

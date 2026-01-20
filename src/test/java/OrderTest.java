
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OrderTest extends BaseOrderTest {



    private final String name;
    private final String lastName;
    private final String address;
    private final String metroStation;
    private final String telephone;
    private final String data;
    private final String dropdownOption;
    private final String scooterColor;
    private final String comment;

    public OrderTest(String name, String lastName, String address,
                     String metroStation, String telephone, String data, String dropdownOption,String scooterColor,
                     String comment) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.data= data;
        this.dropdownOption= dropdownOption;
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
      orderStepsPage.rentSteps(data, dropdownOption, scooterColor,comment);
      orderStepsPage.getOrderConfirmation();
      orderStepsPage.clickYesButton();
      orderStepsPage.getOrderCreatedField();
    }
    @Test
    public void buttonOrderTest2 () {
        mainQuestionPage.openPage();
        mainQuestionPage.clickCookieButton();
      orderStepsPage.clickOrderButton2();
    }
}






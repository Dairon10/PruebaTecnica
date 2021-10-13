package co.com.utest.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPageStep1 extends PageObject{

    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target  INPUT_USER = Target.the( "Where do write the user").located(By.id("firstName"));
    public static final Target  INPUT_LASTNAME = Target.the( "Where do write the user").located(By.id("lastName"));
    public static final Target  INPUT_EMAIL = Target.the( "Where do write the email").located(By.id("email"));
    public static final Target  MONTH_DATE = Target.the( "Where choose the month of the birthday").located(By.id("birthMonth"));
    public static final Target  MONTH_NAME = Target.the( "Where choose the name of the month of the birthday").located(By.xpath("//option[@label='January']"));
    public static final Target  DAY_DATE = Target.the( "Where choose the name of the month of the birthday").located(By.id("birthDay"));
    public static final Target  DAY_NUMBER = Target.the( "Where choose the name of the month of the birthday").located(By.xpath("//option[@label='10']"));
    public static final Target  YEAR_DATE = Target.the( "Where choose the name of the month of the birthday").located(By.id("birthYear"));
    public static final Target  YEAR_NUMBER = Target.the( "Where choose the name of the month of the birthday").located(By.xpath("//option[@label='1998']"));
    public static final Target  NEXT_LOCATION = Target.the( "Where choose location").located(By.xpath("//span[contains(text(),'Next: Location')]"));


}

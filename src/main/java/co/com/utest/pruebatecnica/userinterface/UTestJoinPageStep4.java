package co.com.utest.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class UTestJoinPageStep4 extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the( "Where do write the password").located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the( "Where do confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the( "Where accept the terms and conditions:").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHECK_PRIVACY = Target.the( "Where accept the privacy and Security:").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target  COMPLETE = Target.the( "Where finish the form").located(By.id("laddaBtn"));

}

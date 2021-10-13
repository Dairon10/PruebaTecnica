package co.com.utest.pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPageStep2 extends PageObject{
    public static final Target  NEXT_DEVICES = Target.the( "Where choose devices").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}

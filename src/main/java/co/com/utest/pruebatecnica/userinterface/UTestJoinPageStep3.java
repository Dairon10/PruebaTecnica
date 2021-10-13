package co.com.utest.pruebatecnica.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPageStep3 extends PageObject{
    public static final Target  SELECT_MOBILE = Target.the( "Where choose the Mobile Device:").located(By.xpath("//span[contains(text(),'Select Brand')]"));
    public static final Target  TYPE_MOBILE = Target.the( "Where choose the name of the mobile").located(By.xpath("//div[contains(text(),'Apple')]"));
    public static final Target  SELECT_VERSION = Target.the( "Where choose the Mobile Device:").located(By.xpath("//span[contains(text(),'Select a Model')]"));
    public static final Target  CHOOSE_VERSION = Target.the( "Where choose the version of the mobile").located(By.xpath("//div[contains(text(),'iPhone X')]"));
    public static final Target  SELECT_SYSTEM = Target.the( "Where choose the Mobile Device:").located(By.xpath("//div[@name='handsetOSId']"));
    public static final Target  CHOOSE_SYSTEM = Target.the( "Where choose the version of the mobile").located(By.xpath("//div[contains(text(),'iOS 14.7.1')]"));
    public static final Target  NEXT_LAST = Target.the( "Where choose the last steps").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

}

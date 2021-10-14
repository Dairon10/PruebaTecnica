package co.com.utest.pruebatecnica.tasks;


import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep3;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutFourthPage implements Task {
    private String StrConfirmPassword;
    private String StrPassword;


    public FillOutFourthPage(String StrConfirmPassword , String StrPassword) {
        this.StrPassword   = StrPassword;
        this.StrConfirmPassword   = StrConfirmPassword;
    }

    public static FillOutFourthPage onThePage(String strPassword, String strConfirmPassword){
        return Tasks.instrumented(FillOutFourthPage.class, strPassword, strConfirmPassword);

    }







    @Override
    public <T extends Actor> void performAs (T actor){
      actor.attemptsTo(
              Enter.theValue(StrPassword).into(UTestJoinPageStep4.INPUT_PASSWORD),
              Enter.theValue(StrConfirmPassword).into(UTestJoinPageStep4.CONFIRMPASSWORD),
              Click.on(UTestJoinPageStep4.CHECK_TERMS),
              Click.on(UTestJoinPageStep4.CHECK_PRIVACY),
              Click.on(UTestJoinPageStep4.COMPLETE)
               );
}
   }



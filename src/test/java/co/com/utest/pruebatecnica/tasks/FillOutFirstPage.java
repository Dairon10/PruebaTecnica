package co.com.utest.pruebatecnica.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep1;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep2;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep3;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep4;


import net.serenitybdd.screenplay.actions.Enter;
public class FillOutFirstPage implements Task {
    private String sTrName;
    private String strLastName;
    private String strEmail;


    public FillOutFirstPage(String sTrName, String strLastName, String strEmail) {
        this.sTrName   = sTrName;
        this.strLastName   = strLastName;
        this.strEmail   = strEmail;
    }

    public static FillOutFirstPage onThePage(String sTrName, String strLastName, String strEmail){
        return Tasks.instrumented(FillOutFirstPage.class,sTrName,strLastName,strEmail);

    }







    @Override
    public <T extends Actor> void performAs (T actor){
      actor.attemptsTo(Click.on(UTestJoinPageStep1.REGISTER_BUTTON),
              Enter.theValue(sTrName).into(UTestJoinPageStep1.INPUT_USER),
              Enter.theValue(strLastName).into(UTestJoinPageStep1.INPUT_LASTNAME),
              Enter.theValue(strEmail).into(UTestJoinPageStep1.INPUT_EMAIL),
              Click.on(UTestJoinPageStep1.MONTH_DATE),
              Click.on(UTestJoinPageStep1.MONTH_NAME),
              Click.on(UTestJoinPageStep1.DAY_DATE),
              Click.on(UTestJoinPageStep1.DAY_NUMBER),
              Click.on(UTestJoinPageStep1.YEAR_DATE),
              Click.on(UTestJoinPageStep1.YEAR_NUMBER),
              Click.on(UTestJoinPageStep1.NEXT_LOCATION)
               );
}
   }



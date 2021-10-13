package co.com.utest.pruebatecnica.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep1;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep2;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep3;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep4;


import net.serenitybdd.screenplay.actions.Enter;
public class Register implements Task {
    private String sTrName;
    private String strLastName;
    private String strEmail;
    private String StrConfirmPassword;
    private String StrPassword;


    public Register(String sTrName,String strLastName,String strEmail,String StrConfirmPassword , String StrPassword) {
        this.sTrName   = sTrName;
        this.strLastName   = strLastName;
        this.strEmail   = strEmail;
        this.StrPassword   = StrPassword;
        this.StrConfirmPassword   = StrConfirmPassword;
    }

    public static Register onThePage(String sTrName, String strLastName, String strEmail, String strPassword, String strConfirmPassword){
        return Tasks.instrumented(Register.class,sTrName,strLastName,strEmail, strPassword, strConfirmPassword);

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
              Click.on(UTestJoinPageStep1.NEXT_LOCATION),
              Click.on(UTestJoinPageStep2.NEXT_DEVICES),
              Click.on(UTestJoinPageStep3.SELECT_MOBILE),
              Click.on(UTestJoinPageStep3.TYPE_MOBILE),
              Click.on(UTestJoinPageStep3.SELECT_VERSION),
              Click.on(UTestJoinPageStep3.CHOOSE_VERSION),
              Click.on(UTestJoinPageStep3.SELECT_SYSTEM),
              Click.on(UTestJoinPageStep3.CHOOSE_SYSTEM ),
              Click.on(UTestJoinPageStep3.NEXT_LAST),
              Enter.theValue(StrPassword).into(UTestJoinPageStep4.INPUT_PASSWORD),
              Enter.theValue(StrConfirmPassword).into(UTestJoinPageStep4.CONFIRMPASSWORD),
              Click.on(UTestJoinPageStep4.CHECK_TERMS),
              Click.on(UTestJoinPageStep4.CHECK_PRIVACY),
              Click.on(UTestJoinPageStep4.COMPLETE)
               );
}
   }



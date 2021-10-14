package co.com.utest.pruebatecnica.tasks;


import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep2;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep3;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutThirdPage implements Task {



    public FillOutThirdPage() {

    }

    public static FillOutThirdPage onThePage(){
        return Tasks.instrumented(FillOutThirdPage.class);

    }







    @Override
    public <T extends Actor> void performAs (T actor){
      actor.attemptsTo(
              Click.on(UTestJoinPageStep3.SELECT_MOBILE),
              Click.on(UTestJoinPageStep3.TYPE_MOBILE),
              Click.on(UTestJoinPageStep3.SELECT_VERSION),
              Click.on(UTestJoinPageStep3.CHOOSE_VERSION),
              Click.on(UTestJoinPageStep3.SELECT_SYSTEM),
              Click.on(UTestJoinPageStep3.CHOOSE_SYSTEM ),
              Click.on(UTestJoinPageStep3.NEXT_LAST));
}
   }



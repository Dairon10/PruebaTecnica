package co.com.utest.pruebatecnica.tasks;


import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep1;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep2;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep3;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOutSecondPage implements Task {


    public FillOutSecondPage() {
    }

    public static FillOutSecondPage onThePage(){
        return Tasks.instrumented(FillOutSecondPage.class);

    }







    @Override
    public <T extends Actor> void performAs (T actor){
      actor.attemptsTo(
              Click.on(UTestJoinPageStep2.NEXT_DEVICES));
}
   }



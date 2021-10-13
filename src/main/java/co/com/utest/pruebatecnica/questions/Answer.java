package co.com.utest.pruebatecnica.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.utest.pruebatecnica.userinterface.UTestJoinPageStep1;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question){
        return new Answer(question);
    }

   @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameField = Text.of(UTestJoinPageStep1.INPUT_USER).viewedBy(actor).asString();
        if (question.equals(nameField)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}


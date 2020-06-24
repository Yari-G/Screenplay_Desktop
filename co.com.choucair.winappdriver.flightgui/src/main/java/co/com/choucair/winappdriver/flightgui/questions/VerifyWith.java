package co.com.choucair.winappdriver.flightgui.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.winappdriver.flightgui.userinterfaces.CalculadoraPage.VALIDATION_TEXT;

public class VerifyWith implements Question<Boolean> {
    private String question;

    public VerifyWith(String question){
        this.question = question;
    }
    public static VerifyWith the(String question){
        return new VerifyWith(question);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        String answer = Text.of(VALIDATION_TEXT).viewedBy(actor).asString();
        return question.contains(answer);
    }
}

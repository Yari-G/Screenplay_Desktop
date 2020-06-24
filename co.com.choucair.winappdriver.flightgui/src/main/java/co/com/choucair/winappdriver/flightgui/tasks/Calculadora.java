package co.com.choucair.winappdriver.flightgui.tasks;

import co.com.choucair.winappdriver.flightgui.models.CalculadoraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;
import static co.com.choucair.winappdriver.flightgui.userinterfaces.CalculadoraPage.*;
import static co.com.choucair.winappdriver.flightgui.utils.Constants.ZERO;

public class Calculadora implements Task {
    private List<CalculadoraModel> dataSet;

    public Calculadora(List<CalculadoraModel> dataSet){
        this.dataSet = dataSet;
    }

    public static Calculadora with(List<CalculadoraModel> dataSet) {
        return Tasks.instrumented(Calculadora.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(dataSet.get(ZERO).getNumero1()).into(INPUT_FIRST_NUMBER),
                Click.on(BUTTON_SUM),
                Enter.theValue(dataSet.get(ZERO).getNumero2()).into(INPUT_SECOND_NUMBER),
                Click.on(BUTTON_EQUAL));
    }
}

package co.com.choucair.winappdriver.flightgui.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class CalculadoraPage {

    public static final Target INPUT_FIRST_NUMBER = Target
            .the("input first number")
            .locatedBy(("//*[@AutomationId='CalculatorResults']"));
    public static final Target BUTTON_SUM = Target
            .the("button sum")
            .locatedBy(("//*[@AutomationId='plusButton']"));
    public static final Target INPUT_SECOND_NUMBER = Target
            .the("input second number")
            .locatedBy(("//*[@AutomationId='CalculatorResults']"));
    public static final Target BUTTON_EQUAL = Target
            .the("button equal")
            .locatedBy(("//*[@AutomationId='equalButton']"));
    public static final Target VALIDATION_TEXT = Target
            .the("text of validation")
            .locatedBy(("//*[@Name='Se muestra 9']"));
    private CalculadoraPage(){
    }
}

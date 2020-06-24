package co.com.choucair.winappdriver.flightgui.stepdefinitions;
import co.com.choucair.winappdriver.flightgui.models.CalculadoraModel;
import co.com.choucair.winappdriver.flightgui.questions.VerifyWith;
import co.com.choucair.winappdriver.flightgui.tasks.Calculadora;
import co.com.choucair.winappdriver.flightgui.utils.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CalculadoraStepDefinitions {

    @Given("^that (.*) wants to enter the Calculadora desktop application$")
    public void thatCarlosWantsToEnterTheCalculadoraDesktopApplication (String carlos) {
       theActorCalled(carlos).can(BrowseTheWeb.with(DriverManager.abrirCalculadoraWindows()));
    }

    @When("^he enters the numbers to sum$")
    public void heEntersTheNumbersToSum(List<CalculadoraModel> dataSet) {
        theActorInTheSpotlight().attemptsTo(Calculadora.with(dataSet));
    }

    @Then("^he verifies the mesage (.*)$")
    public void heVerifiesTheMesageSeMuestra(String question) {
        theActorInTheSpotlight().should(seeThat(VerifyWith.the(question)));
    }
}

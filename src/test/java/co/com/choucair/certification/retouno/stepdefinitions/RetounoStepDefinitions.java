package co.com.choucair.certification.retouno.stepdefinitions;

import co.com.choucair.certification.retouno.questions.LaRespuesta;
import co.com.choucair.certification.retouno.tasks.Abrir;
import co.com.choucair.certification.retouno.tasks.Registrar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetounoStepDefinitions {

    @Given("^(.*) wants to access the Web Automation Demo Site$")
    public void carlosWantsToAccessTheWebAutomationDemoSite(String carlos)  {
        theActorCalled(carlos).wasAbleTo(Abrir.laPaginaAutomationDemoPage());
    }

    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<String> data)  {
        theActorInTheSpotlight().attemptsTo(Registrar.la(data));
    }

    @Then("^he verifies that the screen is loaded with text - Double Click on Edit Icon to (.*) the Table Row\\.$")
    public void heVerifiesThatTheScreenIsLoadedWithTextDoubleClickOnEditIconToEDITTheTableRow(String pregunta) {
       theActorInTheSpotlight().should(seeThat(LaRespuesta.es(pregunta)));
    }


}

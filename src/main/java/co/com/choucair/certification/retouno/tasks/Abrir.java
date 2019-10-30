package co.com.choucair.certification.retouno.tasks;

import co.com.choucair.certification.retouno.userinterface.AbrirAutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {

    private AbrirAutomationDemoSitePage abrirAutomationDemoSitePage;

    public static Performable laPaginaAutomationDemoPage() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirAutomationDemoSitePage));

    }
}

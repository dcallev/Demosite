package co.com.choucair.certification.retouno.interaction;

import co.com.choucair.certification.retouno.model.entity.InformacionREntity;
import co.com.choucair.certification.retouno.userinterface.RegistrarAutomationDemosSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarHobbies implements Interaction {

    public static SeleccionarHobbies desde(){
        return new SeleccionarHobbies();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (InformacionREntity.getInformacionR().getHobbies().contains("Cricket")) {
            actor.attemptsTo(Click.on(RegistrarAutomationDemosSitePage.HOBBIES_CRICKET));
        }
        if (InformacionREntity.getInformacionR().getHobbies().contains("Movies")) {
            actor.attemptsTo(Click.on(RegistrarAutomationDemosSitePage.HOBBIES_MOVIES));
        }
        if (InformacionREntity.getInformacionR().getHobbies().contains("Hockey")) {
            actor.attemptsTo(Click.on(RegistrarAutomationDemosSitePage.HOBBIES_HOCKEY));
        }
    }
}

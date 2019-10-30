package co.com.choucair.certification.retouno.tasks;

import co.com.choucair.certification.retouno.interaction.SeleccionarHobbies;
import co.com.choucair.certification.retouno.interaction.SeleccionarLenguaje;
import co.com.choucair.certification.retouno.model.entity.InformacionREntity;
import co.com.choucair.certification.retouno.userinterface.RegistrarAutomationDemosSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.retouno.util.Constantes.COMA;
import static co.com.choucair.certification.retouno.util.Constantes.MALE;

public class Registrar implements Task {
    private List<String> data;

    public Registrar(List<String> data) {

        this.data = data;
    }

    public static Registrar la(List<String> data) {

        return new Registrar(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        InformacionREntity.setInformacionR(data);

        actor.attemptsTo(Enter.theValue(InformacionREntity.getInformacionR().getFirst_name()).into(RegistrarAutomationDemosSitePage.FIRST_NAME),
                Enter.theValue(InformacionREntity.getInformacionR().getLast_name()).into(RegistrarAutomationDemosSitePage.LAST_NAME),
                Enter.theValue(InformacionREntity.getInformacionR().getAddress()).into(RegistrarAutomationDemosSitePage.ADDRESS),
                Enter.theValue(InformacionREntity.getInformacionR().getEmail_address()).into(RegistrarAutomationDemosSitePage.EMAIL_ADDRESS),
                Enter.theValue(InformacionREntity.getInformacionR().getPhone()).into(RegistrarAutomationDemosSitePage.PHONE),

                Check.whether(InformacionREntity.getInformacionR().getGender().trim().equals(MALE))
                        .andIfSo(Click.on(RegistrarAutomationDemosSitePage.GENDER_MALE))
                        .otherwise(Click.on(RegistrarAutomationDemosSitePage.GENDER_FEMALE)),

                SeleccionarHobbies.desde(),
                SelectFromOptions.byVisibleText(InformacionREntity.getInformacionR().getSkills()).from(RegistrarAutomationDemosSitePage.SKILLS),

               Click.on(RegistrarAutomationDemosSitePage.LANGUAGES),
                SeleccionarLenguaje.desde(RegistrarAutomationDemosSitePage.LIST_LANGUAGES, InformacionREntity.getInformacionR().getLanguages(), COMA),
               Click.on(RegistrarAutomationDemosSitePage.AREA_BLANCA),

                SelectFromOptions.byVisibleText(InformacionREntity.getInformacionR().getCountry()).from(RegistrarAutomationDemosSitePage.COUNTRY),
                Click.on(RegistrarAutomationDemosSitePage.SELECT_COUNTRY),

                Enter.theValue(InformacionREntity.getInformacionR().getSelect_country()).into(RegistrarAutomationDemosSitePage.WRITTE_COUNTRY).thenHit(Keys.ENTER),


                SelectFromOptions.byVisibleText(InformacionREntity.getInformacionR().getYear()).from(RegistrarAutomationDemosSitePage.DATE_BIRTH_YEAR),
                SelectFromOptions.byVisibleText(InformacionREntity.getInformacionR().getMonth()).from(RegistrarAutomationDemosSitePage.DATE_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(InformacionREntity.getInformacionR().getDay()).from(RegistrarAutomationDemosSitePage.DATE_BIRTH_DAY),

                Enter.theValue(InformacionREntity.getInformacionR().getPassword()).into(RegistrarAutomationDemosSitePage.PASSWORD),
                Enter.theValue(InformacionREntity.getInformacionR().getConfirm_password()).into(RegistrarAutomationDemosSitePage.CONFIRM_PASSWORD),
                Click.on(RegistrarAutomationDemosSitePage.SUBMIT)


        );



    }
}

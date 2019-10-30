package co.com.choucair.certification.retouno.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class retounoHook {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }
}

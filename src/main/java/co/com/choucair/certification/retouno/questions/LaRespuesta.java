package co.com.choucair.certification.retouno.questions;

import co.com.choucair.certification.retouno.userinterface.RegistrarAutomationDemosSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<Boolean> {
    private String pregunta;


    public LaRespuesta (String pregunta) {
        this.pregunta = pregunta;

    }
    public static LaRespuesta es(String pregunta){
        return new LaRespuesta(pregunta);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
       boolean  resultado;
    String comparacion = Text.of(RegistrarAutomationDemosSitePage.EDIT).viewedBy(actor).asString();
    if (pregunta.equals(comparacion)){
        resultado = true;
    }else {
        resultado = false;
    }
        return resultado;
    }
}

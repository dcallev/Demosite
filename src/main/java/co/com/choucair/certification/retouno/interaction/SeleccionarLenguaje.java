package co.com.choucair.certification.retouno.interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;


public class SeleccionarLenguaje implements Interaction {

    private Target lista;
    private String opcion;
    private String caracter;

    public  SeleccionarLenguaje (Target lista, String opcion, String caracter){
        this.lista = lista;
        this.opcion = opcion;
        this.caracter = caracter;
    }
    public static SeleccionarLenguaje desde(Target lista, String opcion, String caracter){
        return new SeleccionarLenguaje(lista, opcion, caracter);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] separadorOpcion = opcion.split(""+caracter+"");
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
                for (int i = 0; i < listObjeto.size(); i++){
                            for (int j = 0; j < separadorOpcion.length; j++) {
                                if (listObjeto.get(i).getText().trim().equals(separadorOpcion[j])){
                                    listObjeto.get(i).click();
                                    break;
                                }

                    }
                }
    }
}

package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionDiagnostics;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebDBanckRegistrarFinanciacion;

public class PreguntaFinanciar implements Question<Boolean> {

    String pregunta;
    public PreguntaFinanciar (String pregunta){
        this.pregunta=pregunta;
    }

    public static PreguntaFinanciar seRegistro(String pregunta) {
    return new PreguntaFinanciar(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String respuesta;
       respuesta= Text.of(ElementosWebDBanckRegistrarFinanciacion.verificar).viewedBy(actor).asString();
       if(respuesta.equals(pregunta)){
           return true;
       }else
           return false;
    }
}

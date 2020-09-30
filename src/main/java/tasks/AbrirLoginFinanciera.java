package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.AbrirLoginPageFinanciera;

public class AbrirLoginFinanciera implements Task {
   AbrirLoginPageFinanciera abrirLoginPageFinanciera;
    public static AbrirLoginFinanciera laPagina(){
   return Tasks.instrumented(AbrirLoginFinanciera.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Open.browserOn(abrirLoginPageFinanciera));
    }
}

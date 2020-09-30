package tasks;

import model.DBanckFinancieraDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosWebDBanckRegistrarFinanciacion;
import util.Constantes;

import java.util.List;

public class Diligenciar  implements Task {
    List<DBanckFinancieraDataModel> losdatos;
    public Diligenciar(List losdatos){
    this.losdatos=losdatos;
    }

   public static Diligenciar financiacioncon(List<DBanckFinancieraDataModel> losdatos){
     return new Diligenciar(losdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Enter.theValue(losdatos.get(Constantes.posicion).getUser()).into(ElementosWebDBanckRegistrarFinanciacion.username),
              Enter.theValue(losdatos.get(Constantes.posicion).getPassword()).into(ElementosWebDBanckRegistrarFinanciacion.password),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.check),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.boton),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.digital),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.newaplicaciomj),
              SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getEmployment()).from(ElementosWebDBanckRegistrarFinanciacion.employmentstatus),
              Enter.theValue(losdatos.get(Constantes.posicion).getTotalanual()).into(ElementosWebDBanckRegistrarFinanciacion.anual),
              Enter.theValue(losdatos.get(Constantes.posicion).getMonthlyrent()).into(ElementosWebDBanckRegistrarFinanciacion.rent),
              Enter.theValue(losdatos.get(Constantes.posicion).getMonthlyauto()).into(ElementosWebDBanckRegistrarFinanciacion.loan),
              Enter.theValue(losdatos.get(Constantes.posicion).getMonthlyother()).into(ElementosWebDBanckRegistrarFinanciacion.otherloan),
              Enter.theValue(losdatos.get(Constantes.posicion).getMonthlyminimum()).into(ElementosWebDBanckRegistrarFinanciacion.creditcard),
              Enter.theValue(losdatos.get(Constantes.posicion).getCreditcard1()).into(ElementosWebDBanckRegistrarFinanciacion.cardspend),
              SelectFromOptions.byVisibleText(losdatos.get(Constantes.posicion).getAccound()).from(ElementosWebDBanckRegistrarFinanciacion.havebank),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.check1),
              Click.on(ElementosWebDBanckRegistrarFinanciacion.aply)
      );
    }
}

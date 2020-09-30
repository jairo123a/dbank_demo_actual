package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebDBanckRegistrarFinanciacion {
    public static final Target username=Target.the("ingreso username").located(By.id("username"));
    public static final Target password=Target.the("ingreso password").located(By.id("password"));
    public static final Target check=Target.the("check remenber").located(By.id("remember-me"));
    public static final Target boton=Target.the("ingreso enviar").located(By.id("submit"));
    public static final Target digital=Target.the("ingreso digital credito").located(By.xpath("//a[text()='Digital Credit']"));
    public static final Target newaplicaciomj=Target.the("click en nueva aplicacion").located(By.xpath("//*[@id=\'main-menu\']/ul/li[5]/ul/li/a"));
    public static final Target employmentstatus=Target.the("ingresar emploment").located(By.id("employmentStatus"));
    public static final Target anual=Target.the("select income").located(By.id("annualIncome"));
    public static final Target rent=Target.the("ingresar mort").located(By.id("monthlyMortgage"));
    public static final Target loan=Target.the("ingreso loan").located(By.id("monthlyAutoLoan"));
    public static final Target otherloan=Target.the("ingreso other").located(By.id("monthlyOtherLoan"));
    public static final Target creditcard=Target.the("ingreso creditcard").located(By.id("minimumCreditCard"));
    public static final Target cardspend=Target.the("ingreso cardspend").located(By.id("monthlySpend"));
    public static final Target havebank=Target.the("select havebank").located(By.id("bankStatus"));
    public static final Target check1=Target.the("select check").located(By.xpath("//input[@id='agreeTerms']"));
    public static final Target aply=Target.the("click en aplicar").located(By.xpath("//button[@class='btn btn-success btn-lg btn-block']"));
   public static  final Target verificar=Target.the("verifico respuesta").located(By.xpath("//p[contains(text(),'Thank you for your interest in a Digital Credit ac')]"));
}

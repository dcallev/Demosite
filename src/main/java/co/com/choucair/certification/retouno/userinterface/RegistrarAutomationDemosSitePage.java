package co.com.choucair.certification.retouno.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrarAutomationDemosSitePage extends PageObject {

    public static final Target FIRST_NAME = Target.the("Campo Nombre")
            .located(By.xpath("//input[@placeholder='First Name']"));

    public static final Target LAST_NAME = Target.the("Campo Apellido")
            .located(By.xpath("//input[@placeholder='Last Name']"));

    public static final Target ADDRESS = Target.the("Direccion")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

    public static final Target EMAIL_ADDRESS = Target.the("Correo")
            .located(By.xpath("//*[@id='eid']/input"));

    public static final Target PHONE = Target.the("Teléfono")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));

    public static final Target GENDER_MALE = Target.the("Masculino")
            .located(By.xpath("//label[1]//input[1]"));

    public static final Target GENDER_FEMALE = Target.the("Femenino")
            .located(By.xpath("//label[2]//input[1]"));

    public static final Target HOBBIES_CRICKET = Target.the("Campo Cricket")
            .located(By.id("checkbox1"));

    public static final Target HOBBIES_MOVIES = Target.the("Campo Movie")
            .located(By.id("checkbox2"));

    public static final Target HOBBIES_HOCKEY = Target.the("Campo Hockey")
            .located(By.id("checkbox3"));

    public static final Target LANGUAGES = Target.the("Lenguaje")
            .located(By.xpath("//div[@id='msdd']"));

    public static final Target LIST_LANGUAGES = Target.the("Lista de lenguaje")
            .located(By.xpath("//section[@id='section']//li"));

    public static final Target AREA_BLANCA = Target.the("Area blanca")
            .located(By.xpath("//div[@class='container center']//div[contains(@class,'row')]"));

    public static final Target SKILLS = Target.the("Habilidades")
            .located(By.xpath("//*[@id='Skills']"));

    public static final Target COUNTRY = Target.the("País")
            .located(By.xpath("//select[@id='countries']"));


    public static final Target SELECT_COUNTRY = Target.the("Seleccionar país")
            .located(By.xpath("//span[@class='select2-selection select2-selection--single']"));

    public static final Target WRITTE_COUNTRY = Target.the("Escribir país")
            .located(By.xpath("//input[@class='select2-search__field']"));

    public static final Target  DATE_BIRTH_YEAR = Target.the("Año")
            .located(By.xpath("//select[@id='yearbox']"));

    public static final Target DATE_BIRTH_MONTH = Target.the("Mes")
            .located(By.xpath("//select[@placeholder='Month']"));

    public static final Target DATE_BIRTH_DAY = Target.the("Día")
            .located(By.xpath("//select[@id='daybox']"));

    public static final Target PASSWORD = Target.the("Contraseña")
            .located(By.xpath("//input[@id='firstpassword']"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirmar contraseña")
            .located(By.xpath("//input[@id='secondpassword']"));

    public static final Target SUBMIT = Target.the("Enviar")
            .located(By.xpath("//button[@id='submitbtn']"));

    public static final Target EDIT = Target.the("Pregunta")
            .located(By.xpath("//b[contains(text(),'EDIT')]"));












}

package com.nttdata.stepsdefinitions;

import com.nttdata.page.PrincipalPage;
import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.PrincipalSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStepsDef {
    private WebDriver driver;

    private PrincipalSteps principalStep;

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String email, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(email);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();

    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String cat1, String subcat1) {
        principalStep = new PrincipalSteps(driver);
        driver = getDriver();
        screenShot();

        principalStep.verCategoria(cat1);
        principalStep.clickButtonCategoria();

        principalStep.verSubcategoria(subcat1);
        principalStep.clickBtnSubcategoria();

    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int productos) throws InterruptedException {
        driver = getDriver();
        principalStep.categoriaMen();
        Thread.sleep(3000);
        principalStep.AgregarProductos();
        Thread.sleep(500);
        screenShot();
        principalStep.añadirAlCarrito();
        Thread.sleep(3000);
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        driver = getDriver();
        principalStep.confirmacionCarrito();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {

        driver = getDriver();
        principalStep.confirmarMontoFinal();
    }
}










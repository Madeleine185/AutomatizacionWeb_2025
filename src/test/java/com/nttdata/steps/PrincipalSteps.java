package com.nttdata.steps;

import com.nttdata.page.PrincipalPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PrincipalSteps {

    private WebDriver driver;

    //Generar el constructor

    public PrincipalSteps (WebDriver driver){
        this.driver = driver;
    }

    public void verCategoria (String categoria){
        String categoria_pag = this.driver.findElement(PrincipalPage.categoryButton).getText();
        System.out.println(categoria);
        System.out.println(categoria_pag);
        Assert.assertEquals("Nombre de la Categoría",categoria,categoria_pag);
    }

    public void clickButtonCategoria() {

        this.driver.findElement(PrincipalPage.categoryButton).click();
    }

    public void verSubcategoria (String subCategoria){
        String sub_categoria = this.driver.findElement(PrincipalPage.subcategoryButton).getText();
        System.out.println(subCategoria);
        System.out.println(sub_categoria);
        Assert.assertEquals("Nombre de la Categoría",subCategoria,sub_categoria);
    }

    public void clickBtnSubcategoria() {

        this.driver.findElement(PrincipalPage.subcategoryButton).click();
    }

    public void categoriaMen(){
        this.driver.findElement(PrincipalPage.seccionMen).click();
    }

    public void AgregarProductos(){

        this.driver.findElement(PrincipalPage.clickAgregar).click();
    }

    public void añadirAlCarrito(){

        this.driver.findElement(PrincipalPage.buttonCarrito ).click();
    }
    public void confirmacionCarrito(){
        String checkconfirmacion = this.driver.findElement(PrincipalPage.confirmacionCarrito).getText();
        String titulo_popup = checkconfirmacion.substring(1);
        String mensajeEsperado = "Producto añadido correctamente a su carrito de compra";
        Assert.assertEquals(mensajeEsperado,titulo_popup);
    }

    public void confirmarMontoFinal(){
        float precioPorUnidad  = Float.parseFloat(this.driver.findElement(PrincipalPage.precioPorUnidad).getText().substring(3));
        float cantidadProducto = Float.parseFloat(this.driver.findElement(PrincipalPage.cantidadProductos).getText());
        float totalMonto = Float.parseFloat(this.driver.findElement(PrincipalPage.total).getText().substring(3));

        Assert.assertEquals("Monto Esperado Pop Up:",String.valueOf(totalMonto),String.valueOf(precioPorUnidad*cantidadProducto));
    }

    public void FinalizarCompra(){
        this.driver.findElement(PrincipalPage.finalizarCompra).click();
    }


    public void validarTituloCarrito(){
        this.driver.findElement(PrincipalPage.tituloCarrito).click();
    }

    public void calculoDePreciosCarrito(){
        float precio_unitario = Float.parseFloat(this.driver.findElement(PrincipalPage.precioUnitarioFinal).getText().substring(3));
        float cantidad_producto = Float.parseFloat(this.driver.findElement(PrincipalPage.cantidadProductoFinal).getText().substring(0,1));
        float total_monto = Float.parseFloat(this.driver.findElement(PrincipalPage.montoTotalFinal).getText().substring(3));

        Assert.assertEquals("Monto Esperado Carrito de Compras:",String.valueOf(total_monto),String.valueOf(precio_unitario*cantidad_producto));
    }

}

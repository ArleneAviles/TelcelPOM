package com.telcel.pages;

import com.telcel.utils.Celular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaProducto {

    public WebDriver driver;
    public WebDriverWait wait;

    public PaginaProducto(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
    }

    WebElement marca_ModeloCelular;  // css:".ecommerce-ficha-tecnica-opciones-compra-titulo #ecommerce-ficha-tecnica-modelo"
    WebElement nombreCelular;  // css:".ecommerce-ficha-tecnica-opciones-compra-titulo h1#ecommerce-ficha-tecnica-nombre"
    WebElement precioFinal; // css:".ecommerce-ficha-tecnica-precio-pagos.ng-scope #ecommerce-ficha-tecnica-precio-obj"
    WebElement capacidadCelular;  // css: "[ng-repeat="cap in capacidades"] .ecommerce-ficha-tecnica-opciones-compra-capacidad"


    public void verificarPagina(){

    }

    public void verificarInformacionCelular(Celular cel){

    }
}

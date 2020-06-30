package com.telcel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalSeleccionEstado {

    public WebDriver driver;
    public WebDriverWait wait;

    public ModalSeleccionEstado(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
    }

    WebElement seleccionaEstadoDropdown;  //css=".chosen-single"
    WebElement campoBusquedaEstad; //css=".chosen-search > input"
    WebElement ligaEstado;  //css=".chosen-results .active-result"
    WebElement botonEntrar; //css="#entrarPerfilador"


    public void verificarPagina(){

    }

    public void seleccionarEstado(String estado){

    }
}

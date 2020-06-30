package com.telcel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public LandigPage(WebDriver we){
        this.driver = we;
        wait = new WebDriverWait(driver, 15);
    }
    @FindBy(css="[data-menusup='Logo']")
    WebElement LogoTelcel;

    @FindBy(css=".gluoTienda .text-option")
    WebElement linkTiendaEnLínea;

    @FindBy(css=".dropdown-menu [href='/personas/equipos/telefonos-y-smartphones']")
    WebElement linkTelefonosCelulares;


    public void navegar(String url){

    }
    public void verificarPagina(){

    }

    public void seleccionardeTiendaEnLinea(String opcion){

    }

}

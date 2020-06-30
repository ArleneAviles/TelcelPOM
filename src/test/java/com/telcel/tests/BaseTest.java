package com.telcel.tests;

import com.telcel.pages.LandingPage;
import com.telcel.pages.ModalSeleccionEstado;
import com.telcel.pages.PaginaProducto;
import com.telcel.pages.PaginaResultados;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;
    public LandingPage landing;
    public PaginaProducto producto;
    public PaginaResultados resultados;
    public ModalSeleccionEstado modalEstado;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait
    }

    @Afterpublic void after(){

    }
}

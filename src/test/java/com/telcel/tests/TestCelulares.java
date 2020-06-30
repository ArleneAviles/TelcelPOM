package com.telcel.tests;

import com.telcel.utils.Celular;
import org.junit.Test;

public class TestCelulares extends BaseTest{

    @Test
    public void testSeleccionarCelular(){
        landing.navegar("https://telcel.com");
        landing.verificarPagina();
        landing.seleccionardeTiendaEnLinea("smartphones");
        modalEstado.verificarPagina();
        modalEstado.seleccionarEstado("Jalisco");
        resultados.verificarPagina();
        resultados.verificarResultados();
        Celular elegido = resultados.capturarInformacionCelular(1);
        resultados.seleccionarCelular();
        producto.verificarPagina();
        producto.verificarInformacionCelular(elegido);
    }
}

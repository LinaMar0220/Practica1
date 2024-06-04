package com.linamar;

public class mainPractica {
    public static void main (String[] args){
        navegadorChrome browser = new navegadorChrome();
        String texto = browser.ingresarTexto("Prueba exitosa");
        System.out.println( texto);

        browser.hacerClic();
        System.out.println("El navegador seleccionado es: " + browser.getTipoNavegador());

        System.out.println(browser.localizarElemento());

        System.out.println(browser.mostrarMensaje("Mensaje exitoso para la visualización"));

        System.out.println("-----------------------------------------------------------------------------------------------");

        navegadorFirefox fire = new navegadorFirefox();
        System.out.println(fire.localizarElemento());
        fire.hacerClic();
        System.out.println(("El navegador seleccionado es: " + fire.getTipoNavegador()));
        System.out.println(fire.ingresarTexto("Prueba con exito"));
    }
}

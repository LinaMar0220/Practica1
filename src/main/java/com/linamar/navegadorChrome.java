package com.linamar;

public class navegadorChrome extends navegador {
    @Override
    public String localizarElemento() {
        return "Se localizo el elemento en el navegador Chrome";
    }

    @Override
    public String ingresarTexto(String texto) {
        return "Se ingreso el texto deseado en el navegador Chrome: " + texto;
    }

    @Override
    public void hacerClic (){setTipoNavegador("CHROME");}

    public String mostrarMensaje (String mensaje) {
        return "El mensaje que se mostrara en Chrome es: " + mensaje;
    }
}

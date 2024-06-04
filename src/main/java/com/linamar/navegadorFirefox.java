package com.linamar;

public class navegadorFirefox extends navegador {
    @Override
    public String localizarElemento(){
        return "Se localiza el elemento en el navegador de Firefox";
    }

    @Override
    public String ingresarTexto(String texto){
        return "Se ingreso el texto deseado en el navegador Firefox: " + texto;
    }

    @Override
    public void hacerClic (){setTipoNavegador("FIREFOX");}
}

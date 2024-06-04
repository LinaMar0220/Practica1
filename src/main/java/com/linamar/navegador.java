package com.linamar;

public abstract class navegador implements accionesNavegador {

     private String tipoNavegador;

    public String getTipoNavegador() {
        return tipoNavegador;
    }

    public void setTipoNavegador(String tipoNavegador) {
        this.tipoNavegador = tipoNavegador;
    }

    public abstract String localizarElemento ();
    public void hacerClic (){this.tipoNavegador= "Se ingreso el tipo de navegador deseado"; }
    public abstract String ingresarTexto (String texto);
}

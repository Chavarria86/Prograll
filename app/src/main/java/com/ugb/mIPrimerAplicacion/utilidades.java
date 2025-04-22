package com.ugb.mIPrimerAplicacion;

import java.util.Base64;

public class utilidades {
    static String url_consulta = "http://192.168.85.23:5984/agenda/_design/agenda/_view/agenda";
    static String url_mto = "http://192.168.1.7:5984/agenda";
    static String user = "Emer_progra";
    static String passwd = "12345678";
    static String credencialesCodificadas = Base64.getEncoder().encodeToString((user + ":" + passwd).getBytes());
    public String generarUnicoId(){
        return java.util.UUID.randomUUID().toString();
    }
}
// conexion a la base de datos para movil
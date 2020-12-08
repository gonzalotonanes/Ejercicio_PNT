package ejercicio_pnt;

import java.text.DecimalFormat;

public class Conversion {

    private static DecimalFormat formatoSalida = new DecimalFormat("0");

    public static String borrarDecimales(double precio) {

        //separo los enteros de la parte decimal
        long iPart = (long) precio;
        double fPart = precio - iPart;
        String cadena = String.valueOf(precio);

        // compruebo si la parte decimal es = cambio el formato de salida a sin decimales
        if (fPart == 0) {
            cadena = formatoSalida.format(precio);
        } else {
            cadena = String.valueOf(precio);
        }

        return cadena;
    }
}

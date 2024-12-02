package Codigo_TEST_IQ.src.controller.util;
//validaciones, aleatorio, metodo para limpiar pantalla

import java.util.Scanner;

public class Utilidades {

    private static final Scanner sn = new Scanner(System.in);

    // Generar aleatorio
    public static int aleatorio(int min, int max) {
        double aux;
        aux = Math.random() / Math.nextDown(1.0);
        return ((int) (min * (1.0 - aux) + max * aux));
    }

    public static String readString(String message) {
        System.out.println(message);
        return sn.nextLine();
    }

    public static char readChar(String message) {
        return readString(message).toLowerCase().charAt(0);
    }

    public static float desviacionEstandar(/* Parametros a considerar */) {

        return 0.0f;
    }
}

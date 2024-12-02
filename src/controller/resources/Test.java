package Codigo_TEST_IQ.src.controller.resources;

import controller.util.Utilidades;

public class Test {

    public static int tomarTest(String Direccion, int dificultad, int min, int max, int cantidadPreguntas,
            String[] preguntas) {
        int aciertos = 0;
        char respuesta;
        // int[] literales = GeneradorLiterales.ordenarArsreglo(min, max,
        // cantidadPreguntas);
        for (int i = 0; i < cantidadPreguntas; i++) {
            // System.out.println(Preguntas[i]);
            // llamar a gestor de archivo y que devuelva un string con respecto a literal[i]
            GestorPreguntas gestion = new GestorPreguntas(preguntas[i]);
            String pregunta = gestion.getPregunta();
            String[] literales = gestion.getRespuestas();
            do {
                System.out.println(pregunta);
                for (int j = 0; j < 4; j++) {
                    System.out.println(literalCorrecto(j + 1) + ".- " + literales[j]);
                }
                respuesta = Utilidades.readChar("Ingrese su respuesta: ");
            } while (!respuestaValida(respuesta));
            if (respuesta == literalCorrecto(gestion.getRespuestaCorrecta())) {
                aciertos += dificultad;
            }
        }
        return aciertos;
    }

    // metodo para convertir 1, 2, 3, 4 -> a, b, c, d
    public static char literalCorrecto(int i) {
        return switch (i) {
            case 1 ->
                'a';
            case 2 ->
                'b';
            case 3 ->
                'c';
            case 4 ->
                'd';
            default ->
                ' ';
        };
    }

    // método para validar si se ingresó a,b,c ó d
    public static boolean respuestaValida(int respuesta) {
        boolean si = true;
        if (!(respuesta >= 97 && respuesta <= 100)) {
            si = false;
        }
        return si;
    }

    public static float calculoCociente(int aciertos, float mediaAciertos, float desviacionAciertos) {
        float iq;
        iq = ((aciertos - mediaAciertos) / Codigo_TEST_IQ.src.controller.util.Utilidades.desviacionEstandar()) * 15
                + 100;
        return iq;
    }
}

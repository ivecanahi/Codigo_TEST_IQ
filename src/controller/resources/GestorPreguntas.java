package Codigo_TEST_IQ.src.controller.resources;

public class GestorPreguntas {

    private String pregunta;
    private final String[] respuestas;
    private int respCorrecta;

    /**
     * @param string contatenado que contiene 1 pregunta con sus respuestas
     *               constructor de clase que inicializa respuestas y separa el
     *               string
     */
    public GestorPreguntas(String linea) {
        respuestas = new String[4];
        separarCadena(linea);
    }

    /**
     * @param string que se separará
     *               separa las partes del string divididas por @
     *               elimina el identificador Æde respuesta correcta y guarda cual
     *               es
     */
    private void separarCadena(String linea) {
        String token = "@";
        // Æ alt+146
        String verificador = "Æ";
        String[] separado = linea.split(token);
        pregunta = separado[0];
        for (int i = 1; i < separado.length; i++) {
            if (separado[i].contains(verificador)) {
                separado[i] = separado[i].replace(verificador, "");
                respCorrecta = i;
            }
            respuestas[i - 1] = separado[i];

        }
    }

    public String getPregunta() {
        return pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getRespuestaCorrecta() {
        return respCorrecta;
    }
}

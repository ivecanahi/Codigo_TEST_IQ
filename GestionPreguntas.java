package Codigo_TEST_IQ;

import java.util.ArrayList;

public class GestionPreguntas {

    //╣ = Alt + 1465
    //defino "token" como el separador de preguntas y respuestas
    //defino "identificadorCorrecto" como el simbolo que define la respuesta correcta
    private static final String indentificadorCorrecto = "╣";
    private static final String token = "@";
    String pregunta;
    ArrayList<String> respuestas;
    int respuestaCorrecta;
//CONSTRUCTOR DE LA CLASE

    public GestionPreguntas(String linea) {
        respuestas = new ArrayList<>();
        dividirLineas(linea);
    }
//Metodo para separar la pregunta y las respuestas

    public void dividirLineas(String linea) {
        //Guardo en un array de strings cada linea dividida por @
        String[] partes = linea.split(token);
        //asigno a la variable global pregunta el valor del primer string obtenido de la separacion
        pregunta = partes[0];
        //recorro el array que contiene las respuestas
        for (int i = 1; i < partes.length; i++) {
            String respuesta = partes[i];
            //averiguamos si es la respuesta correcta
            if (respuesta.contains(indentificadorCorrecto)) {
                //el literal 1,2,3 o 4 será la respuesta correcta
                respuestaCorrecta = i;
                //Se reemplaza en el string el tonken que define la respuesta correcta
                //por nada=""
                respuesta = respuesta.replace(indentificadorCorrecto, "");
            }
            //añadimos el string respuesta al arraylist global "respuestas"
            this.respuestas.add(respuesta);
        }
    }

}

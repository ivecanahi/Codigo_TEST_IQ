package Codigo_TEST_IQ.src.controller.resources;

public class GestorPreguntas {
    private String pregunta;
    private String[] respuestas;
    private int respCorrecta;

    public GestorPreguntas(String linea) {
    
    }
    public void separarCadena(String linea) {
        String token = "@";
        //Ð alt+465
        String verificador = "Ð";
    }
    public String getPregunta() {
        return pregunta;
    }
    public String getRespuesta(int i) {
        return respuestas[i];
    }
    public int getRespuestaCorrecta() {
        return respCorrecta;
    }
    public void setPregunta(String preguntaS) {
        this.pregunta = preguntaS;
    }
    public void setRespuesta(String respuestaS, int literal) {
        this.respuestas[literal] = respuestaS;
    }
    public void setRespCorrecta(int literal) {
        this.respCorrecta = literal;
    }
}

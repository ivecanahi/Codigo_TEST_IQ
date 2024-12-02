package Codigo_TEST_IQ.src.views;

public class MainTest {
    public static void main(String[] args) {
        // Preguntas de prueba para comprobar el funcionamiento
        String[] preguntas = { "Hola como estas?@si@mal@Ðdimelo@no",
                "Cual de los siguientes anagramas es equivalente a ADAN?@Nadan@Andan@ÐNada@Anden",
                "Quien da programación?@Luis@Miguel@Mi vecino@ÐJose Guaman",
                "De que tienes hambre?@pollo@repe@bolon@Ðpastel" };

        // imprime solo los aciertos para comprobar el funcionamiento
        System.out.println(Codigo_TEST_IQ.src.controller.resources.Test.tomarTest("Direccion", 2, 1, 4, 4, preguntas));
    }
}

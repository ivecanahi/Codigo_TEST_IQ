package Codigo_TEST_IQ.src.controller.resources;

import controller.util.Utilidades;

public class GeneradorLiterales {
    public static int[] generarAleatorio(int min, int max, int cantidad) {
        int[] valores = new int[cantidad];
        int flag;
        for (int i = 0; i < cantidad; i++) {
            do {
                flag = 0;
                valores[i] = Utilidades.aleatorio(min, max);
                for (int j = 0; j < i; j++) {
                    if (valores[j] == valores[i]) {
                        flag = 1;
                        break;
                    }
                }
            } while (flag == 1);
        }
        return valores;
    }

    public static int[] ordenarArreglo(int min, int max, int cantidad) {
        int[] arreglo = generarAleatorio(min, max, cantidad);
        int aux;
        // Ordenamiento básico
        for (int i = 0; i < cantidad; i++) {
            for (int j = i + 1; j < cantidad; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }
}

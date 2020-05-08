/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa8;

import javax.swing.*;

/**
 *
 * @author Usaurio
 */
public class Operaciones {

    public static Integer valorMinimo(Integer[][] array) {
        int minimo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            int minimoFila = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < minimoFila) {
                    minimoFila = array[i][j];
                }
            }
            if (minimoFila < minimo) {
                minimo = minimoFila;
            }
        }
        return minimo;
    }

    public static Integer valorMaximo(Integer[][] array) {
        int maximo = array[0][0];
        for (int i = 0; i < array.length; i++) {
            int maximoFila = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maximoFila) {
                    maximoFila = array[i][j];
                }
            }
            if (maximoFila > maximo) {
                maximo = maximoFila;
            }
        }
        return maximo;
    }

    public static void buscarValor(Integer[][] array, Integer valor) {
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            System.out.println("Fila: " + i + "\nPosición: " + j);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("-1");
        }
    }

    public static void borrarValor(Integer[][] array, Integer valor) {
        loop:
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            array[i][j] = null;
                            System.out.println(valor);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("null");
        }
    }
}

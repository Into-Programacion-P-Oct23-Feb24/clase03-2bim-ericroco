/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        int suma = 0;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {

                if (fila == col) {
                    suma = suma + arreglo1[fila][col];
                }
            }
        }
        System.out.println(suma);
        /* note que los valores a sumar caian en casillas donde la fila y 
         la columna tenian el mismo valor, por lo tanto use un condicional en el
         que si fila y columna eran iguales el valor se sume el valor que existe
         en esa ubicacion y se acumule en la variable suma, para luego presentar
         todo al final del codigo */
    }
}

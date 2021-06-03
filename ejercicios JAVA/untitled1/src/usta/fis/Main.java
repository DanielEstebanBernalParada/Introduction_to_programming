
package usta.fis;
import java.util.Scanner;
class main{

    public static void main(String[] args) {

        final int FILAS = 3, COLUMNAS = 2;
        Scanner sc = new Scanner(System.in);
        int i, j, mayor, menor;
        int filaMayor, filaMenor, colMayor, colMenor;

        int[][] A = new int[FILAS][COLUMNAS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < FILAS; i++) {
            for (j = 0; j < COLUMNAS; j++) {
                System.out.print("Columna[" + i + "] Fila [" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
/*
        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz
        mayor = menor = A[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = colMayor = colMenor = 0;
        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < A.length; i++) {  //para cada fila de la matriz
            for (j = 0; j < A[i].length; j++) { //para cada columna de la matriz
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    filaMayor = i;
                    colMayor = j;
                } else if (A[i][j] < menor) {
                    menor = A[i][j];
                    filaMenor = i;
                    colMenor = j;
                }
            }
        }
        //Mostrar por pantalla el mayor elemento de la matriz,el menor y las posiciones que ocupan
        System.out.print("Elemento mayor: " + mayor);
        System.out.println(" Fila: "+ filaMayor + " Columna: " + colMayor);
        System.out.print("Elemento menor: " + menor);
        System.out.println(" Fila: "+ filaMenor + " Columna: " + colMenor);
 */
    }
}
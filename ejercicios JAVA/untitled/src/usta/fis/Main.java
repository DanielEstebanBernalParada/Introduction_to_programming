//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package usta.fis;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        p_show_info_program();
        int i = 0;
        int serie = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa el numero limites de la escala fibonacci: ");
        int serie = keyboard.nextInt();
        int[] fibo_array = new int[100];
        fibo_array = serie_fibonacci(serie);
        System.out.println("la escala fibonacci para el numero " + serie + " es:");

        for(; fibo_array[i] != -1; ++i) {
            if (fibo_array[i + 1] != -1) {
                System.out.print(fibo_array[i] + ", ");
            } else {
                System.out.print(fibo_array[i]);
            }
        }

    }

    public static int[] serie_fibonacci(int limit) {
        int[] fibo_array = new int[100];
        int i = 1;
        fibo_array[0] = 0;

        for(fibo_array[1] = 1; fibo_array[i - 1] + fibo_array[i] < limit; ++i) {
            fibo_array[i + 1] = fibo_array[i - 1] + fibo_array[i];
            fibo_array[i + 2] = -1;
        }

        return fibo_array;
    }

    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════╗");
        System.out.println("║      fabonacci-soft V1.0    ║");
        System.out.println("║  Maker:Daniel Esteban Bernal║");
        System.out.println("║   Date: 2021-April          ║");
        System.out.println("╚═════════════════════════════╝");
    }
}

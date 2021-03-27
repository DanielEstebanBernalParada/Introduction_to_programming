package usta.fis;

//Author: Daniel Bernal
//Date:16-03-2021
//Description: This software show variable than input by keyboard

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("sofinputNumber version 1.0  ");
        System.out.println("Maker: Daniel Bernal ");
        System.out.println("-----------------------------");
        Scanner Keyboard= new Scanner(System.in);
        int v_number1, v_number2, v_sum;
        System.out.println("Imput de first number");
        v_number1= Keyboard.nextInt();
        System.out.println("Imput de second number");
        v_number2= Keyboard.nextInt();
        v_sum = v_number1 + v_number2;
        System.out.println("The total sum is "+v_sum);
    }
}

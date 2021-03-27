package usta.fis;
/*AUTHOR    : Daniel Bernal
 DATE       : 23-03-2021
 DESCRIPTION: this software calculate the time between two cities
*/
import java.util.Scanner;  //para usar el tecaldo del software
public class Main {

    public static void main(String[] args) {
        p_show_info_program();

        //calculate TIME = DISTANCE / VELOCITY

        float v_time=0; //la variable v_time es decimal = float / double
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("The time between two cities is: " +v_time+" hours");


    }
    public static void p_show_info_program(){
        //Date       : 23 March of 2021
        //DESCRIPTION: this method show info software.
        System.out.println("----------------------------------------");
        System.out.println("!       SOFTCYCLE VERSION 1,0          !");
        System.out.println("!     MAKER: Daniel Bernal        !");
        System.out.println("DESCR: Calculate time between two cities");
        System.out.println("----------------------------------------");
    }

    public static int p_user_distance(){
        //Description: this method return the distance than user input
        Scanner keyboard = new Scanner (System.in); //use la variable keyboard como instancia para el teclado
        System.out.println("Input distance (KM) between two cities:");
        int v_distance = keyboard.nextInt();
        while(v_distance<0){
            System.err.println("ERR: the distance should be greater than zero");
            v_distance= keyboard.nextInt(); //pidiendo por teclado la variable de V_DISTANCE
        }
        return v_distance;
    }
    public static int p_user_velocity(){
        //DESCRIPTION: this method return the velocity than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the constance velocity (KM/H) between two cities:");
        int v_velocity = keyboard.nextInt();
        while (v_velocity<=0){
            System.err.println("ERR: the velocity cannot be same zero or less than zero, input again the velocity (KM/H) ");
            v_velocity= keyboard.nextInt();
        }
        return v_velocity;
    }
}
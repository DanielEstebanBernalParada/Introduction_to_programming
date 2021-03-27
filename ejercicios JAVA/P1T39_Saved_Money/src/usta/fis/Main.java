package usta.fis;

/*AUTHOR    : Daniel Bernal
 DATE       : 25-03-201
 DESCRIPTION: this software calculate the total money saved in a year
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved=0;
        for (int i=1;i<=12;i=i+1){
            System.out.println("----Month "+i+"-----");
            v_total_saved=v_total_saved+p_user_saved_money();

        }
        System.out.println("The total saved money in year is:$ "+v_total_saved);
    }
    public static void p_show_info_program(){
        //DESCRIPTION: this method show info program (software)
        System.out.println("----------------------------------------");
        System.out.println("!       SOFTTOTALMONEY VERSION 1,0     !");
        System.out.println("!     MAKER: Daniel Bernal       !");
        System.out.println("        Date: 25-03-2021             ");
        System.out.println("----------------------------------------");
    }
    public static int p_user_saved_money(){
        //Description: this method return the saved money in month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the saved money in the month:(COP)$");
        int v_saved_money = keyboard.nextInt();
        while(v_saved_money<0){
            System.err.println("ERR: you saved money cannot be less than zero, input again the saved money (CO)$:");
            v_saved_money= keyboard.nextInt();
        }
        return v_saved_money;
    }
}
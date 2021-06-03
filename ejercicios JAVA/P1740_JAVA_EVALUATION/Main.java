package usta.fis;
/*
Makers: Daniel Bernal
Date: 26/03/2021
Description: This software its about calculate the average height(cm) of  childrens
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_average=0;
        int v_sum=0;
        for (int i=1; i<=5;i=i+1){
            System.out.println("----Children "+i+"----");
            v_sum=v_sum+p_user_height();
            v_average= v_sum/5 ;
        }
        System.out.println("The average of the height is:"+v_average);
    }

    public static void p_show_info_program() {
        //DESCRIPTION: This method show info program (software)
        System.out.println("-----------------------------------------------------");
        System.out.println("           SoftHeightChildren V1.0                   ");
        System.out.println("Maker: Daniel Bernal");
        System.out.println("           Date: 26-03-2021");
        System.out.println("-----------------------------------------------------");
    public static int p_children_height(){
        //Description: this methods will return the height of the childrens
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the childrens height in cm");
        int v_height =keyboard.nextInt();
        while (v_height < 50 || v_height > 200){
            System.err.println("ERR:the height cannot most be less 50 Cm and cannot more than 200 Cm");
            v_height =keyboard.nextInt();
        }
        return v_height;
    }
}
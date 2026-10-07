/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject90;

/**
 *
 * @author NDUVHO
 */import java.util.Scanner;
public class Mavenproject90 {

    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
       String a;
       double b,c,d,e;
       System.out.println("USERNAME");
    a=input.nextLine();
    System.out.println("password");
    b=input.nextDouble();
    
    
    
    if(a.equals ("kyosk")  && b==32){
        System.out.println("welcome back " +a);
    }
    else {
                System.out.println(" to resert passwod enter your lucky number");
                e=input.nextDouble();
                System.out.println("new password");
                c=input.nextDouble();
                System.out.println("cornfirm new password");
                d=input.nextDouble();
                
                if(e !=19)
                    System.out.println("invalid lucky number");
    
                else{
    if(c==d){
        System.out.println("password reserted succesfully");
    }
        else {
                System.out.println("password dosent match");
                }
    }
    }
    }
}


                

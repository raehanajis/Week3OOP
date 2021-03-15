/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Random;
import java.util.Scanner;

public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    //Generate Nomor acak
    Random nomor_acak= new Random();
    int gatcha=nomor_acak.nextInt(100);
    
    //Buat Input nomor dari user
    Scanner input=new Scanner(System.in);
    System.out.println("Nomor randum : " + gatcha );
    System.out.println("Guess a magic number between 0 and 100 " );
    
    //Looping jika user salah menebak
    int user ;
    int a=0  ;
    boolean jackpot=false ;
    
    while(jackpot==false){
        user=input.nextInt();
        
        if(user==gatcha){
            jackpot=true;
        }
        //jika nomor terlalu rendah dari hasil random
        else if(user<gatcha){
            a++;
            System.out.println("Your guess is too low" );
        }
        //jika nomor terlalu tinggi dari hasil random
        else if(user>gatcha){
             a++;
             System.out.println("Your guess is too high" );
        }
        
    }
        //Jika user benar menebak
        System.out.println("You win");
        System.out.println("Then number was "+gatcha);
        
    }
    
}

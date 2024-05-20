package com.mycompany.mparking;

import java.util.Scanner;

public class Mparking {

    public static void main(String[] args) {
        Scanner  scanner =new Scanner (System.in);
        boolean e=true;
       while(e){
        System.out.println(" Main Menu ");
        System.out.println(" 1_park Vehicle");
        System.out.println(" 2_unpark Vehicle");
           System.out.println("3_For area information"+"\n"+ "4_Exit");
        int ch=scanner.nextInt();
        switch (ch)
        {
            case 1 :
            vehicle .add(scanner);
        break;
            case 2 :
                vehicle.remove(scanner);
                break;
            case 3: 
                vehicle.are();
                break;
            case 4:
                e=false;
                break;
               }
           System.out.println("_____________________________________________________________________");
    
       }}
}
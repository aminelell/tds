package TD1.lesConditions;

import java.util.Scanner;

public class Exo8 {

        public static void main(String[] args){
            System.out.println("donner le numéro du mois :");
            Scanner s = new Scanner(System.in);
            int a= s.nextInt();
            switch (a){
                case 1:{
                    System.out.println("janvier=31");
                } break;
                case 2:{
                    System.out.println("donner l'anner :");
                    int b= s.nextInt();
                    if ((b%4)==0) System.out.println("février=29");
                    else System.out.println("février=28");
                } break;
                case 3:{
                    System.out.println("mars=31");
                } break;
                case 4:{
                    System.out.println("avril=30");
                } break;
                case 5:{
                    System.out.println("mai=31");
                } break;
                case 6:{
                    System.out.println("juin=30");
                } break;
                case 7:{
                    System.out.println("juillet=31");
                } break;
                case 8:{
                    System.out.println("aout=31");
                } break;
                case 9:{
                    System.out.println("septembre=30");
                } break;
                case 10:{
                    System.out.println("octobre=31");
                } break;
                case 11:{
                    System.out.println("novembre=30");
                } break;
                case 12:{
                    System.out.println("decembre=31");
                } break;

            }
        }
    }

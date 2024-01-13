package TD1.lesConditions;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args){
        System.out.println("donner deux elements :");
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        System.out.println("vos elements sont :\na= "+a+"\nb= "+b);
        if (a>b) System.out.println("le classement par ordre croissant : "+b +" "+a);
        else System.out.println("le classement par ordre croissant : "+a +" "+b);
    }

}

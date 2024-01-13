package TD1.lesConditions;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args){
        System.out.println("donner l'heure :");
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        System.out.println("donner la langue ( f pour francais et a pour anglais ):");
        char l= (char) s.nextShort();
        if (l == 'f'){
            if((t>=0)&&(t<=18)) System.out.println("Bonjour");
            else if((t>=19)&&(t<=22)) System.out.println("Bonsoir");
            else if((t>=23)&&(t<=24)) System.out.println("Bonne nuit");
        }
        else if (l == 'a'){
            if((t>=0)&&(t<=18)) System.out.println("good morning");
            else if((t>=19)&&(t<=22)) System.out.println("good evening");
            else if((t>=23)&&(t<=24)) System.out.println("good night");
        }

    }
}

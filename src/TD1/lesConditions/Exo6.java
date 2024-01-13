package TD1.lesConditions;
import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args){
        System.out.println("donner deux entiers :");
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("vos elements sont :\na= "+a+"\nb= "+b);
        if(((a<=0)&&(b<=0))||((a>0)&&(b>0))) System.out.println("le produit est positif ");
        else System.out.println("le produit est negatif ");
    }
}

package TD1.lesConditions;
import java.util.Scanner;
public class Exo7 {
        public static void main(String[] args){
            System.out.println("donner un nombre de trois chiffres non nuls separé par des espaces:");
            Scanner s = new Scanner(System.in);
            int a= s.nextInt();
            int b= s.nextInt();
            int c= s.nextInt();
            System.out.println("N="+a+b+c);
            if ((a!=0)&&(b!=0)&&(c!=0)){
                System.out.println("les nombres formes par les chiffres de N sont :");
                System.out.println(" "+a+b+c+","+a+c+b+","+b+a+c+","+b+c+a+","+c+a+b+","+c+b+a);

            }

        }
}


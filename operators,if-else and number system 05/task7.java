import java.util.Scanner;

public class task7 {
    public static void main(String[]arge){
        Scanner input=new Scanner(System.in);
        System.out.print("enter principal ");
        float P=input.nextFloat();
        System.out.print(" enter Rate ");
        float R= input.nextFloat();
        System.out.print(" enter time ");
        float T= input.nextFloat();

        double c= P* Math.pow((1+R/100),T);         


        System.out.print(" compound interest = " +c);

    }
    
}

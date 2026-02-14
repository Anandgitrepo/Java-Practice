import java.util.Scanner;
public class task6{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a value of principal ");
        float P=input.nextFloat();
        System.out.println("enter a value of Rate");
        float R=input.nextFloat();
        System.out.println("enter a value of time");
        float T=input.nextFloat();

        float c= (P*R*T)/100;

        System.out.println("simple interest = "+c);
    }
    
}
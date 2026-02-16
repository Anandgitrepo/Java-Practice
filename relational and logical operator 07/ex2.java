//logical operator
import java.util.Scanner;
public class ex2 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to ticket discount calculator");
        System.out.println( "enter your age");
        int age=input.nextInt();
        System.out.println("are you a female?(true/false)");
        boolean isFemale =input.nextBoolean();

        if(age<5 && isFemale){
            System.out.println(" eligible for 125% discount");

        }else if(age>60 && isFemale){
            System.out.println("eligible for 75% discount");
        }
        else if(age>=5 && isFemale){
            System.out.println("eligible for 50% discount");
        }
        else  if( isFemale){
            System.out.println("eligible for 50% discount");
        }
        else if(age<5){
            System.out.println("eligible for 75% discount");
        }
        else if(age>60){
        System.out.println("eligible for 25% discount");
        }
        else {
            System.out.println("no discount");
        }



    }
     
}

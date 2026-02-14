import java.util.Scanner;
public class task5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the value of base");
        float b=input.nextFloat();
        System.out.print("enter the value of height");
        float h=input.nextFloat();

        double c= 0.5f*(b*h);   //pahle agar 0.5 likh rahe ho to usko typecast karna padega nahi to wo as an integer dekha jayega or uska result 0 lelega , to over all answer v 0 ho jayega

        System.out.print("area of triangle " +c);

    }
}

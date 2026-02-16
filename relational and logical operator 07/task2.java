import java.util.Scanner;
public class task2 {
    public static void main(String[]arge){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");

        int num=input.nextInt();
        if(num%2==0){
            System.out.println("even number");

        }else{
            System.out.println("odd number");
        }

    }
    
}

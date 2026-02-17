import java.util.Scanner;
public class ex1{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=input.nextInt();
        System.out.println("enter 2nd number");
        int b=input.nextInt();

        int result= a & b;   //bitwise AND (&)
        System.out.println(result);

        //take 1st number= 5 and second number = 12
        //it gives you 4  

        int result2= a|b;   //bitwise or
        System.out.println(result2);
        //take 6(0110) and 12(1100) it will give your 14 (1110)
         


        

    }
}
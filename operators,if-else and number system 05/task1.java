import java.util.Scanner;
public class task1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.print("enter a value of a ");
        int a= input.nextInt();
        
         System.out.print("enter a calue of b ");
        //int c=a;
        int b=input.nextInt();
       
        int c=a;    //1st hold the value of one varibale than swap
        a=b;
        b=c;

        System.out.println("value of a= "+a);
        System.out.println("value of b= "+b);

    }
}
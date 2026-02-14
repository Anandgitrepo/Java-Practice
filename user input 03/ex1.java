import java.util.Scanner;
public class ex1{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your name");
        String Name= input.nextLine();
        System.out.println("welcome "+Name );

        Scanner sc= new Scanner(System.in);
        System.out.print("enter your age");
        int age=sc.nextInt();
        System.out.println("your agre "+age);

        Scanner input2= new Scanner(System.in);
        System.out.print("enter your marks");
        float marks=input2.nextFloat();
        System.out.println("your marks "+ marks);
    }
} 
import java.util.Scanner;
public class task3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=input.nextInt();
        System.out.println("enter 2nd number");
        int num2=input.nextInt();
        System.out.println("enter 3rd number");
        int num3=input.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("num1 is the greatest" +num1);
        }
        else if(num2>num1 && num2>num3 ){
            System.out.println("num2 is the greatest"+num2);
        }
        else{
            System.out.println("num 3 is greatest " +num3);
        }
    }
    
}

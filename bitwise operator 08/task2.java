import java.util.Scanner;
public class task2 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a 1st number");
        int a=input.nextInt();
        
        int result= a<<4;     //bitwise  left shift  input 4 to uska power 4 ho jayega  
        System.out.println(result);
    }
}
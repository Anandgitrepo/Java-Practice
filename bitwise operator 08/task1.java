import java.util.Scanner;
public class task1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter a 1st number");
        int a=input.nextInt();
        
        int result= ~a;     //compliment or not operator - it inverts the bits 0 ti 1 and 1 to 0
        System.out.println(result); //take input 11 - it will give you (1011(11) - 11110100(-12))


    }
    
}

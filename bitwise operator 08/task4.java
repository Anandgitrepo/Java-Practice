
import java.util.Scanner;
public class task4 {

    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("enter your number");
        int num=input.nextInt();
        if((num & 1)==1){       // bracket for num & 1 because precendence of == is greater than & 
            System.out.println("odd number");

        }else{
            System.out.println("even number");
        }
    }

 

    
}

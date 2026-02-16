import java.util.Scanner;
public class ex1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println(" enter your age");
        int age= input.nextInt();

        // if(age<18){
        //     System.out.println("not eligible to vote");
        // }
        // else if(age>=18){
        //     System.out.println(" you are eligible to vote");
        // }
        if(age>=18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible");
        }
      

    }
    
}

//shorthand operator
import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){
        int a=5;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a 1st value");
        int b=input.nextInt();
        a=a+b;
        System.out.println(a);
        int x=input.nextInt();
        a=a+x;
        System.out.println(a);
        int y=input.nextInt();
        a=a+y;
        System.out.println(a);
        int z=input.nextInt();
        a+=z;   //shorthand  operator
        System.out.println(a);

        
        
        //int c=a+b+x+y+z;
        //System.out.println("sum of a and user input is "+c);
    }

    
}

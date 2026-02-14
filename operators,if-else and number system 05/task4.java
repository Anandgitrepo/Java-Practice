import java.util.Scanner;
public class task4 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter length");
        int l=input.nextInt();
        System.out.println("enter breadth");
        int b=input.nextInt();

        int c = 2*(l+b);

        System.out.println("perimeter of rectange is " +c);

    }
}

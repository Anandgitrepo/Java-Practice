import java.util.Scanner;
public class task8{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print(" enter fahrenhiet" );
        float F=input.nextFloat();

        float C= (F-32)*5/9;

        System.out.print("celcius = "+C);
    }
    
}
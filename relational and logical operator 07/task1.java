import java.util.Scanner;
public class task1 {
public static void main(String[]args){
System.out.println("enter your number");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
if(num>0){
    System.out.println("positive number");

}else if(num<0){
    System.out.println("negative number");
}
else{
    System.out.println(" number is zero");
}

}


    
}

import java.util.Scanner;

public class Test_FDE {
    public static void main(String[] args){
        double a,b;
        System.out.println("Enter the values for the program: ");
        System.out.print("a =  ");
        a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        b = new  Scanner(System.in).nextDouble();
        phuongtrinhbac1 eq= new phuongtrinhbac1(a,b);
       System.out.println(eq.resolve(a,b));
    }
}

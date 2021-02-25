import java.util.Scanner;

public class Test_SDE {
    public static void main(String[] args){
        double a,b,c;
        System.out.println("Enter the values for the program: ");
        System.out.print("a = ");
        a = new Scanner(System.in).nextDouble();
        System.out.print("b = ");
        b = new  Scanner(System.in).nextDouble();
        System.out.print("c = ");
        c = new  Scanner(System.in).nextDouble();
        phuongtrinhbac2 eq= new phuongtrinhbac2(a,b,c);
        System.out.println(eq.resolve());
    }
}

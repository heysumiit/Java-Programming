import java.util.Scanner;

public class UnaryOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.println("Unary plus of A : "+(+a));
        System.out.println("Unary munus of A : "+(-a));
        System.out.println("Increment of A : "+(++a));
        System.out.println("Decrement of A : "+(--a));
    }
}
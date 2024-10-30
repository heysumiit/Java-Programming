import java.util.Scanner;

public class RelationalOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("A == B : "+(a == b));       // Equal to 
        System.out.println("A != B : "+(a != b));       // Not equal to
        System.out.println("A > B : "+(a > b));         // Greater than
        System.out.println("A < B : "+(a < b));         // Less than
        System.out.println("A >= B : "+(a >= b));       // Greater than or Equal to
        System.out.println("A <= b : "+(a <= b));       // Less than or Equal to
    }
}
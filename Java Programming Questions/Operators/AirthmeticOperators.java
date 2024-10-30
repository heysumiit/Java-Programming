import java.util.Scanner;

public class AirthmeticOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("A + B = "+(a + b));     // Addition
        System.out.println("A - B = "+(a - b));     // Subtraction
        System.out.println("A * B = "+(a * b));     // Multiplication
        System.out.println("A / B = "+(a / b));     // Division
        System.out.println("A % B = "+(a % b));     // Modulus
    }
}
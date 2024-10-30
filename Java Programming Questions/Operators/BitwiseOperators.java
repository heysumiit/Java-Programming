import java.util.Scanner;

public class BitwiseOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.println("A & B : "+(a & b));       //Bitwise AND
        System.out.println("A | B : "+(a | b));       //Bitwise OR
        System.out.println("A ^ B : "+(a ^ b));       //Bitwise XOR
        System.out.println("~ A : "+(~a));            //Bitwise NOT
        System.out.println("A << B : "+(a << b));     //Left Shift
        System.out.println("A >> B : "+(a >> b));     //Right Shift
        System.out.println("A >>> B : "+(a >>> b));   //Unsigned Right Shift

    }
}
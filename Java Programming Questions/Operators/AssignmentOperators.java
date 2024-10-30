import java.util.Scanner;

public class AssignmentOperators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        a+=b;   // a = a + b
        System.out.println("A += B : "+a);

        a-=b;   // a = a - b
        System.out.println("A -= B : "+a);

        a*=b;   // a = a * b
        System.out.println("A *= B : "+a);

        a/=b;   // a = a / b
        System.out.println("A /= B : "+a);

        a%=b;   // a = a % b
        System.out.println("A %= B : "+a);

        a&=b;   // a = a & b
        System.out.println("A &= B : "+a);

        a|=b;   // a = a | b
        System.out.println("A |= B : "+a);

        a^=b;   // a = a ^ b
        System.out.println("A ^= B : "+a);

        a<<=1;  // a = a << 1
        System.out.println("A <<= B : "+a);

        a>>=1;  // a = a >> 1
        System.out.println("A >>= B : "+a);

        a>>>=1; // a = a >>> a
        System.out.println("A >>>= B : "+a);
    }
}
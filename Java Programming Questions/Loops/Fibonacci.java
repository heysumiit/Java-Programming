import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.print("Fibonacci Sequences : 0 1");
        for(int i = 2; i < num; i++){
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}
import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += i;
        }
        System.out.print("Sum from 1 To "+num+" Is : "+sum);
    }
}
import java.util.Scanner;

public class FactorialForLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        
        if(num < 1){
            System.out.print("Invalid Number");
        }
        else if(num == 0 || num == 1){
            System.out.print("Factorial is : 1");
        }
        else{
            int fact = 1,i;
            for(i = 1; i <= num; i++){
                fact = fact * i;
            }
        System.out.print("Factorial is : "+fact);
        }
    }
}
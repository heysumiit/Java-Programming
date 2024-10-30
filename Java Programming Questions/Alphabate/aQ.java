import java.util.Scanner;

public class aQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd number : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
               if(i == 1 || i == num || j == 1 || j == num){
                    System.out.print("*");
               }else if(i == j && i >= (1 + num)/2 ){
                    System.out.print("*");
               }else{
                    System.out.print(" ");
               }
            }
           System.out.println(" ");
        } 
        int a = 5;
        int b = num + a;

        for(int x = 1; x <= a; x++){
            for(int z = 1; z <= x; z++){
            if(x +z >=num){
                int p =x+z;
                if(p%2==0){
                    System.out.print("+");
                }else{
                    System.out.print("+");
                }
            }
            }System.out.print("+");
        }System.out.print(" ");



         }
        }
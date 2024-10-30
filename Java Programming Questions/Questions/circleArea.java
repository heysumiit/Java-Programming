import java.util.Scanner;

public class circleArea{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Radius : ");
        double radius = sc.nextDouble();

        double pi = 3.14;
        double area = pi*radius*radius;
        
        System.out.print("Area of circle is : "+area);
    }
}
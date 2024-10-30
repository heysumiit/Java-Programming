import java.util.Scanner;

public class triangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Side : ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Side : ");
        double b = sc.nextDouble();

        System.out.print("Enter Third Side : ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);

        System.out.print("Area of Triangle is : "+area);
    }
}
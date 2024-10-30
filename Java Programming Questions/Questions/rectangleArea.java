import java.util.Scanner;

public class rectangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of a Rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter width of a Rectangle : ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.print("Area of Rectangle is : "+area);
    }
}
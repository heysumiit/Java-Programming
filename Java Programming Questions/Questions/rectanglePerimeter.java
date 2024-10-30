import java.util.Scanner;

public class rectanglePerimeter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of a Rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter width of a Rectangle : ");
        double width = sc.nextDouble();

        double temp = length + width;
        double perimeter = 2 * temp;

        System.out.print("Perimeter of a Rectangle : "+perimeter);
    }
}
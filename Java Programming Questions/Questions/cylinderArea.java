import java.util.Scanner;

public class cylinderArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Cylinder : ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of Cylinder : ");
        double height = sc.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius * height;

        System.out.print("Area of Cylinder is : "+area);
    }
}
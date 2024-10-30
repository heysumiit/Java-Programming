import java.util.Scanner;

public class distanceAB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X-1 : ");
        double x1 = sc.nextDouble();

        System.out.print("Enter Y-1 : ");
        double y1 = sc.nextDouble();

        System.out.print("Enter X-2 : ");
        double x2 = sc.nextDouble();

        System.out.print("Enter Y-2 : ");
        double y2 = sc.nextDouble();

        double finalX = x1 - x2;
        double finalY = y1 - y2;

        double distance = Math.pow((Math.pow(finalX, 2) + Math.pow(finalY, 2)), 0.5);
        System.out.print("Distance from A to B is : "+distance);
    }
}
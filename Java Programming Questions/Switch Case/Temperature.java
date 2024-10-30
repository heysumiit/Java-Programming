import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c,f,k;
        System.out.println("-: Temperature Converter :-");
       
        System.out.println("1. Fahrenheit To Celsius");
        System.out.println("2. Celsius To Fahrenheit");
        System.out.println("3. Kelvin To Celsius");
        System.out.println("4. Celsius To Kelvin");
        System.out.println("5. Fahrenheit To Kelvin");
        System.out.println("6. Kelvin To Fahrenheit");

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.print("1. Enter Fahrenheit : ");
                f = sc.nextDouble();
                c = (f - 32) * 5/9;
                System.out.print("Celsius Is : "+c);
                break;

            case 2:
                System.out.print("2. Enter Celsius : ");
                c = sc.nextDouble();
                f = (c * 9) / 5 + 32;
                System.out.print("Fehrenheit Is : "+f);
                break;

            case 3:
                System.out.print("3. Enter Kelvin : ");
                k = sc.nextDouble();
                c = k - 273.15;
                System.out.print("Celsius Is : "+c);
                break;

            case 4:
                System.out.print("4. Enter Celsius :");
                c = sc.nextDouble();
                k = c + 273.15;
                System.out.print("Kelvin Is : "+k);
                break;

            case 5:
                System.out.print("5. Enter Fahrenheit :");
                f = sc.nextDouble();
                k = ((f - 32) * 5/9) + 273.15;
                System.out.print("Kelvin Is : "+k);
                break;

            case 6:
                System.out.print("5. Enter Kelvin :");
                k = sc.nextDouble();
                double x = k - 273.15;
                double y = x * 5/9;
                f = y + 32;
                System.out.print("Fehrenheit Is : "+f);
                break;

            default:
                System.out.print("Invalid Number again enter");
                break;
        }
    }
}
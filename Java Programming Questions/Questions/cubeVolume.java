import java.util.Scanner;

public class cubeVolume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of a Cube : ");
        int side = sc.nextInt();

        int volume = side * side * side;
        System.out.print("Volume of a Cube is : "+volume);
    }
}
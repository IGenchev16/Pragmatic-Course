import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert A");
        double A = sc.nextDouble();

        System.out.println("Insert B");
        double B = sc.nextDouble();

        System.out.println("Insert C");
        double C = sc.nextDouble();

        if (C > A && C < B) {
            System.out.println("Good job!!! C is between A and B");
        } else {
            System.out.println("Error");
        }
    }
}
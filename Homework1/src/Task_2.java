import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert A");
        int A = sc.nextInt();

        System.out.println("Insert B");
        int B = sc.nextInt();

        int Sum = (A + B);
        int Negative = (A - B);
        int Multiply = (A * B);
        int Devide = (A / B);

        System.out.println("The sum of A+B = " + Sum);
        System.out.println("The negative of A-B = " + Negative);
        System.out.println("The multiply of A*B = " + Multiply);
        System.out.println("The negative of A/B = " + Devide);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert C");
        double C = sc.nextDouble();

        System.out.println("Insert D");
        double D = sc.nextDouble();

        double S = (C+D);
        double N = (C-D);
        double M = (C*D);
        double De = (C/D);

        System.out.println("The sum of C+D = " + S);
        System.out.println("The negaitve of C-D = " + N);
        System.out.println("The multiply of C*D = " + M);
        System.out.println("The devide of C/D = " + De);
        System.out.println();
        System.out.println("Pi4 ti si ebati kodadjiqta");

        }
}
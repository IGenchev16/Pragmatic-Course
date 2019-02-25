import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert A");
        int A = sc.nextInt();

        System.out.println("Insert B");
        int B = sc.nextInt();

        int sum = (A + B);
        int negative = (A - B);
        int multiply = (A * B);
        int devide = (A / B);
        int part = (A % B);

        System.out.println("The sum of A+B = " + sum);
        System.out.println("The negative of A-B = " + negative);
        System.out.println("The multiply of A*B = " + multiply);
        System.out.println("The devide of A/B = " + devide);
        System.out.println("The devide of A%B = " + part);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert C");
        double C = sc.nextDouble();

        System.out.println("Insert D");
        double D = sc.nextDouble();

        double s = (C+D);
        double n = (C-D);
        double m = (C*D);
        double de = (C/D);
        double par = (C%D);

        System.out.println("The sum of C+D = " + s);
        System.out.println("The negaitve of C-D = " + n);
        System.out.println("The multiply of C*D = " + m);
        System.out.println("The devide of C/D = " + de);
        System.out.println("The devide of C/D = " + par);
        System.out.println();
        System.out.println("Pi4 ti si ebati kodadjiqta");

        }
}
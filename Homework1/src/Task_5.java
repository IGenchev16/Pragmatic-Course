import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert A");
        int a = sc.nextInt();

        System.out.println("Insert B");
        int b = sc.nextInt();

        System.out.println("Insert C");
        int c = sc.nextInt();

        if (a > b && a > c && b > c) {
            System.out.println(a + ", " + b + ", " + c); }
        if (a > c && a > b && c > b) {
            System.out.println(a + ", " + c + ", " + b); }
        if (b > a && b > c && a > c) {
            System.out.println(b + ", " + a + ", " + c); }
        if (b > a && b > c && c > a) {
            System.out.println(b + ", " + c + ", " + a); }
        if (c > b && c > a && a > b) {
            System.out.println(c + ", " + a + ", " + b); }
        if (c > b && c > a && b > a) {
            System.out.println(c + ", " + b + ", " + a); }

    }

}

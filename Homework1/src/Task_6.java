import java.util.Scanner;

public class Task_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a1");
        int a1 = sc.nextInt();
        System.out.println("Insert a2");
        int a2 = sc.nextInt();
        System.out.println("Insert a3");
        int a3 = sc.nextInt();
        int b1 = a1;

        a1 = a2; {
            System.out.println(a1); }

        a2 = a3; {
            System.out.println(a2); }

        a3 = b1; {
            System.out.println(a3);
        }

    }
}

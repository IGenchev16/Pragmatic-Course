import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert A");
        int A = sc.nextInt();

        System.out.println("Insert B");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(B + ", " + A); }
            else{
                System.out.println(A + ", " + B);
            }
        }

}

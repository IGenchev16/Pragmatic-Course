import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it ?");
        int a = sc.nextInt();

        System.out.println("How much money do you have");
        double b = sc.nextDouble();

        System.out.println("Are you healthy");
        boolean c = sc.nextBoolean();

        if (c == false && b > 10) {
            System.out.println("Stay home. You're sick. Go and buy drugs");
        } else if (c == false && b <= 10) {
            System.out.println("Stay home. No money. Drink hot tea!");
        }  else if (c == true && b < 10 && a < 20) {
            System.out.println("Go to a coffe shop");
        }  else if (c == true && b < 10 && a > 20) {
            System.out.println("It's too late to go out");
        }  else if (c == true && b >= 10 && a > 20) {
            System.out.println("It's too late to go out");
        }  else if (c == true && b >= 10 && a < 20) {
            System.out.println("Go to a fancy restaurant");
        }
        }
    }

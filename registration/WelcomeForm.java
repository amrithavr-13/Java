package registration;

import java.util.Scanner;

public class WelcomeForm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Welcome, " + firstName + "!");
        System.out.println("Your age is: " + age);
        sc.close();
    }
}

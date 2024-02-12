import java.util.Scanner;

public class MenuOption1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option: \n 1. Prime Number,\n 2. Palindrome Number,\n 3. Factorial Number,\n 4. Armstrong Number, \n 5. Perfect Number");

        int choice = sc.nextInt();

        MenuOption1 ob = new MenuOption1();

        switch (choice) {
            case 1:
                ob.checkPrime();
                break;
            case 2:
                ob.checkPalindrome();
                break;
            case 3:
                ob.calculateFactorial();
                break;
            case 4:
                ob.checkArmstrong();
                break;
            case 5:
                ob.checkPerfect();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        sc.close();
    }

    public void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number.");

        int n = sc.nextInt();
        int m = n / 2;
        int flag = 0;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }

        sc.close();
    }

    public void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }

        sc.close();
    }

    public void calculateFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }

    public void checkArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int digitCount = String.valueOf(num).length();
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }

    public void checkPerfect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }

        sc.close();
    }
}

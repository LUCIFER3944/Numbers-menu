import java.util.Scanner;

public class MenuOption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option: \n 1. Prime Number,\n 2. Palindrome Number,\n 3. Factorial Number,\n 4. Armstrong Number, \n 5. Perfect Number");
        int choice = sc.nextInt(); 
              
     switch (choice) {
            case 1:
            
                System.out.println("You chose Prime Number.");
                int i, m = 0, flag = 0;
                
                int n = sc.nextInt(); // it is the number to be checked
                m = n / 2;
                if (n == 0 || n == 1) {
                    System.out.println(n + " is not a prime number");
                } else {
                    for (i = 2; i <= m; i++) {
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
                break;

            case 2:
                System.out.println("You chose Palindrome Number.");
                int num, reversedNum = 0, originalNum;

                System.out.println("Enter a number: ");
                num = sc.nextInt();

                originalNum = num;

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
                break;

            case 3:
                System.out.println("You chose Factorial Number.");
                int factorialNum, fact = 1;

                System.out.println("Enter a number: ");
                factorialNum = sc.nextInt();

                for (int j = 1; j <= factorialNum; j++) {
                    fact *= j;
                }

                System.out.println("Factorial of " + factorialNum + " is: " + fact);
                break;

            case 4:
                System.out.println("You chose Armstrong Number.");
                int armstrongNum, temp, digit, result = 0;

                System.out.println("Enter a number: ");
                armstrongNum = sc.nextInt();
                temp = armstrongNum;

                while (temp != 0) {
                    digit = temp % 10;
                    result += Math.pow(digit, 3);
                    temp /= 10;
                }

                if (result == armstrongNum) {
                    System.out.println(armstrongNum + " is an Armstrong number.");
                } else {
                    System.out.println(armstrongNum + " is not an Armstrong number.");
                }
                break;

            case 5:
                System.out.println("You chose Perfect Number.");
                int perfectNum, sum = 0;

                System.out.println("Enter a number: ");
                perfectNum = sc.nextInt();

                for (int k = 1; k < perfectNum; k++) {
                    if (perfectNum % k == 0) {
                        sum += k;
                    }
                }

                if (sum == perfectNum) {
                    System.out.println(perfectNum + " is a perfect number.");
                } else {
                    System.out.println(perfectNum + " is not a perfect number.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}

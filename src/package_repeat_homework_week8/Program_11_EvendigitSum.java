package package_repeat_homework_week8;

import java.util.Scanner;

public class Program_11_EvendigitSum {
    public static int getEvendigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            number = number / 10;
        }
        return evenDigitSum;

    }
    public static void main(String[] args) {
        //Scanner declaraton for reading the input from the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        int result = getEvendigitSum(a);
        System.out.println("The sum of even digit is: +" + result);
        //closing the object
        sc.close();
    }
}

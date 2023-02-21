/*
Question : Write a program to print number from n to 1 by using recursion.
 */
import java.util.Scanner;
public class Main {
    static void PrintNumber(int a) {
        if (a == 0)
            return;
            System.out.println(a);
            PrintNumber(a - 1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number :");
        int a = sc.nextInt();
        System.out.println("Firstly, printing the number in descending  order :");
        PrintNumber(a);
        System.out.println();
    }
}
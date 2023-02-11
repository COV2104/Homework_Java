package Homework_1;

import java.util.Scanner;

/**
 * Task_1
 * Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        in.close();
        int triangularNumber = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangularNumber += i;
            factorial *= i;
        }
        System.out.println(n + " треугольное число = " + triangularNumber);
        System.out.println(n + "! = " + factorial);
       
    }

}
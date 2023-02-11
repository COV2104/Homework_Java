package Homework_1;

import java.util.Scanner;
/**
 * Task_2
 * Вывести все простые числа от 1 до 1000
 */

public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        in.close();
        int[] primeNumbers = new int[n + 1];

        for (int i = 2; i <= n; i++) { 
            primeNumbers[i] = 1;
        }

        for (int i = 2; i*i <= n; i++) {
            if (primeNumbers[i] == 1) 
            {
                for (int j = 2; i * j <= n; j++) {
                    primeNumbers[i * j] = 0; 
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeNumbers[i] == 1) {
                System.out.print(i + " "); 
            }
        }
        System.out.println();
    }
}

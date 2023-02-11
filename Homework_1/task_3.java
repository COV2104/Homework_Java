package Homework_1;

import java.util.Scanner;

/**
 * Task_3
 * Реализовать простой калькулятор
 */
public class task_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        System.out.print("Выберите операцию  (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        scanner.close();
        if (operation == '+') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 != 0) {
                System.out.println(num1 + " " + operation + " " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Error! Деление на ноль");
            }
        } else {
            System.out.printf("Error! Некорректный оператор");
        }

    }
}

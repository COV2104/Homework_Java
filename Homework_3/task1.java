package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Task_1
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 * среднее арифметическое из этого списка.
 */
public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = createList();
        System.out.println(arr);
        System.out.println("Минимальное число = " + Collections.min(arr));
        System.out.println("Максимальное число = " + Collections.max(arr));
        System.out.printf("Среднее арифметическое = %.2f %n", findAverage(arr));
        ;
    }

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(-100, 100));
        }
        return list;
    }

    public static double findAverage(ArrayList<Integer> list) {
        double avg = 0;
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        avg = sum / list.size();
        return avg;
    }

}

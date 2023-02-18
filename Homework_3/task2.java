package Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Task_2
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = createList();
        System.out.println(arr);
        deleteEvenNumber(arr);
    }

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(-100, 100));
        }
        return list;
    }

    public static void deleteEvenNumber(ArrayList<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int i = itr.next();
            if (i % 2 == 0)
                itr.remove();
        }
        System.out.println(list);
    }

}

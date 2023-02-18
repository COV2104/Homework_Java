package Homework_3;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] result = createArray();
        int[] sort = sort(result);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(sort));
    }

    public static int[] createArray() {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(-100,100);
        }
        return array;
    }

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int[] left = sort(Arrays.copyOfRange(array, 0, array.length / 2));
            int[] right = sort(Arrays.copyOfRange(array, array.length / 2, array.length));
            return merge(left, right);
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            while (j < right.length) {
                result[k] = right[j];
                j++;
                k++;
            }
        }
        if (j == right.length) {
            while (i < left.length) {
                result[k] = left[i];
                i++;
                k++;
            }
        }
        return result;
    }
}

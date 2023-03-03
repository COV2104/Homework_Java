package Homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Учитывая два целочисленных массива nums1 и nums2, верните максимальную длину подмассива, который появляется в обоих массивах.

    Example 1:
    Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
    Output: 3
    Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].

    Example 2:
    Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
    Output: 5
    Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].
 */
public class task {
    public static void main(String[] args) {
        exam1();
        exam2();
    }

    private static void exam1() {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        findMaxSubArray(nums1, nums2);
        System.out.println();
    }

    private static void exam2() {
        int[] nums1 = new int[]{0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        findMaxSubArray(nums1, nums2);
        System.out.println();
    }

    private static void findMaxSubArray(int[] nums1, int[] nums2) {

        HashSet<ArrayList<Integer>> tempSet1 = getAllSet(nums1);  
        HashSet<ArrayList<Integer>> tempSet2 = getAllSet(nums2);  
        tempSet2.retainAll(tempSet1); 
        int max = 0;
        for (ArrayList<Integer> item : tempSet2) { 
            if (max < item.size()) {
                max = item.size();
            }
        }

        if (max == 0) {
            System.out.println("Нет повторяющихся подмассивов");
            return;
        }
        System.out.printf("Максимальный размер повторяющегося подмассива: %d\n", max);
        ArrayList<ArrayList<Integer>> resultArrays = new ArrayList<>();
        for (ArrayList<Integer> item : tempSet2) { 
            if (max == item.size()) {
                resultArrays.add(item);
            }
        }
        if (resultArrays.size() > 1) {
            System.out.print("Найдено несколько подмассивов максимального размера: ");
        } else {
            System.out.print("Подмассив максимального размера равен: ");
        }
        System.out.println(resultArrays);
    }

    private static HashSet<ArrayList<Integer>> getAllSet(int[] array) {
        HashSet<ArrayList<Integer>> tempSet = new HashSet<>();
        for (int n = 1; n <= array.length; n++) {
            for (int i = 0; i < array.length; i++) {
                ArrayList<Integer> tempArray = new ArrayList<>();
                for (int j = i; j < i + n; j++) {
                    if (j >= array.length) break;
                    tempArray.add(array[j]);
                }
                tempSet.add(tempArray);
            }
        }
        return tempSet;
    }
}

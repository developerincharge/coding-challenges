package com.rizvi.integers;

public class MergeTwoIntArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 10, 12};

        int[] mergedArray = mergeArrays(arr1, arr2);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        // Copy remaining elements of arr1, if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        // Copy remaining elements of arr2, if any
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}

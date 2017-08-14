package com.delta;

public class SortLearning {
    static int[] arr = new int[]{2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static int[] arr2 = new int[]{1, 4, 7, 2, 5, 8, 3, 6, 9, 0};

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        sort1(arr);
        long t2 = System.nanoTime();
        sort2(arr);
        long t3 = System.nanoTime();
        System.out.println((t2 - t1) + "");
        System.out.println((t3 - t2) + "");
        selectSort(arr2);
        printArr(arr2);


    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //冒泡排序
    public static void sort1(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    //优化后的冒泡排序
    public static void sort2(final int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1 && flag; i++) {
            flag = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                    flag = true;
                }
            }
        }
    }

    //简单选择排序算法
    public static void selectSort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }


    public static void swap(final int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

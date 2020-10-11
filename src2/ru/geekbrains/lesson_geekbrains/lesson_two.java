package ru.geekbrains.lesson_geekbrains;

public class lesson_two {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 0;
        arr[4] = 1;
        arr[5] = 0;
        arr[6] = 1;
        arr[7] = 0;
        arr[8] = 0;
        arr[9] = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else if (arr[i] == 1) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n");

        int[] arr2 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] = arr2[i] * 2;
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");

        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = i * j;
                if (arr3[i][j] < 10) System.out.print(" ");
                if (i == j) arr3[i][j] = 1;
                else if (i + j == 4) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + "   ");
            }
        }

        System.out.println("\n");

        int[] arr4 = new int[10];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int) (Math.random() * 10);
            if (arr4[i] > arr4[max]) {
                max = i;
            } else if (arr4[i] < arr4[min]) {
                min = i;
            }
            System.out.print(arr4[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Минимальное значение " + "(" + arr4[min] + ")");
        System.out.println("\n");
        System.out.print("Максимальное значение " + "(" + arr4[max] + ")");

        System.out.println("\n");

        mas(new int[]{1,3,4,5,6,7});
    }
        static void mas(int[] arr) {
            for(int i =0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
}















package Lesson;

import java.util.Scanner;

public class Lesson8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10個の整数を入力
        int[] inputArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " 件目：整数を入力 = ");
            inputArray[i] = scanner.nextInt();
        }

        // 偶数値と奇数値の配列を作成
        int[] evenArray = new int[10];
        int evenCount = 0;
        int[] oddArray = new int[10];
        int oddCount = 0;

        // 入力された整数を偶数値と奇数値で分ける
        for (int i = 0; i < 10; i++) {
            if (inputArray[i] % 2 == 0) {
                evenArray[evenCount] = inputArray[i];
                evenCount++;
            } else {
                oddArray[oddCount] = inputArray[i];
                oddCount++;
            }
        }

        // 偶数値の配列を表示
        System.out.print("偶数値配列 = [");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i]);
            if (i < evenCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 奇数値の配列を表示
        System.out.print("奇数値配列 = [");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i]);
            if (i < oddCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }
}

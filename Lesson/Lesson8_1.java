package Lesson;

public class Lesson8_1 {
    public static void main(String[] args) {
        // 1から10までの値が格納された配列を作成
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = i + 1;
        }

        // 配列の値を表示
        for (int i = 0; i < 10; i++) {
            System.out.println("list[" + i + "] = " + list[i]);
        }
    }
}

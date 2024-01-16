package Lesson;

public class Lesson9_3 {
    static void displayString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // メソッドを利用して実行結果を表示
        displayString("Hello", 3);
        displayString("Good morning", 4);
        displayString("Good evening", 2);
    }
}

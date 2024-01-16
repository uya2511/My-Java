package Lesson;

public class Lesson6_2 {
    public static void main(String[] args) {
        // 1から100までの合計を求める変数
        int sum = 0;

        // 1から100までの数を合計に加える
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        // 合計を画面に表示
        System.out.println("1から100までの合計は: " + sum);
    }
}

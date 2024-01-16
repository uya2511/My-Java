package Lesson;

public class Lesson1_7 {
    public static void main(String[] args) {
        //変数を代入
        String capital = "東京";
        int area = 2193;

        //画面に内容を表示
        displayInfo(capital, area, "---");
    }

    //画面表示用の関数
    private static void displayInfo(String capital, int area, String sep) {
        System.out.println("日本の首都は" + sep + capital + sep + "面積(km)は" + sep + area);
    }
}

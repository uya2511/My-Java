package Lesson;

public class Lesson1_8 {
    public static void main(String[] area) {
        displayText("吾輩は猫である。");
        displayText("名前はまだない。");
        displayText("どこで生まれたか見当がつかぬ。");
        displayText("何でも薄暗いじめじめした所でニャーニャー泣いていた事だけは記憶している。");
        displayText("吾輩はここで始めて人間というものを見た。");
    }

    // 画面表示用の関数
    private static void displayText(String text) {
        System.out.print(text);
    }
}

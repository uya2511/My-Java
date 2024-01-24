package ITtest;

import java.util.Scanner;
 public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 各教科の点数を格納する配列
        int[] scores = new int[5];

        // 各教科の点数を入力
        for (int i = 0; i < 5; i++) {
            System.out.print("教科" + (i + 1) + "の点数を入力してください: ");
            scores[i] = inputScore(scanner);
        }

        // 合計点と平均点を計算して表示
        int totalScore = calculateTotal(scores);
        double averageScore = calculateAverage(scores);

        System.out.println("合計点: " + totalScore);
        System.out.println("平均点: " + averageScore);

        // Scannerをクローズ
        scanner.close();
    }

    // 点数を入力するメソッド
    private static int inputScore(Scanner scanner) {
        int score;

        // 不正な入力があるかどうかを確認
        while (true) {
        try {
        score = scanner.nextInt();

        // 不正な点数の場合は0点として扱う
        if (score < 0 || score > 100) {
        System.out.println("不正な点数を検知しました。0点とします。");
        return 0;
    }

    break; // 正常な入力があればループを抜ける
    } catch (java.util.InputMismatchException e) {
        System.out.println("正しい形式で入力してください。");
        scanner.nextLine(); // 不正な入力を読み捨てる
        }
    }

    return score;
    }

    // 合計点を計算するメソッド
    private static int calculateTotal(int[] scores) {
    int total = 0;
    for (int score : scores) {
       total += score;
    }
        return total;
    }

    // 平均点を計算するメソッド
    private static double calculateAverage(int[] scores) {
        int total = calculateTotal(scores);
        return (double) total / scores.length;
    }
 }
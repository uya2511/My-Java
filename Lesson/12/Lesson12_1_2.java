
import java.util.Scanner;
public class Lesson12_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2つの整数の入力を受け取る
        System.out.print("整数1を入力してください: ");
        int num1 = scanner.nextInt();
        System.out.print("整数2を入力してください: ");
        int num2 = scanner.nextInt();

        // MoreCalc クラスのインスタンスを生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値、平均値、累乗を計算して表示
        int sum = moreCalc.calcSum(num1, num2);
        double average = moreCalc.calcAve(num1, num2);
        double powResult = moreCalc.calcPow(num1, num2);

        System.out.println("合計値: " + sum);
        System.out.println("平均値: " + average);
        System.out.println("累乗: " + powResult);

        // Scanner を閉じる
        scanner.close();
    }
}
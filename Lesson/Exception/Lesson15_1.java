package Exception;
import java.util.Scanner;
public class Lesson15_1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1つ目の整数を入力
            System.out.print("割られる数を入力してください: ");
            int dividend = scanner.nextInt();

            // 2つ目の整数を入力
            System.out.print("割る数を入力してください: ");
            int divisor = scanner.nextInt();

            // 割り算を実行
            double result = divide(dividend, divisor);

            // 結果を表示
            System.out.println("割り算の結果: " + result);
        } catch (ArithmeticException e) {
            // 0で割った場合の例外処理
            System.out.println("0除算例外: " + e.getMessage());
        } catch (Exception e) {
            // その他の例外処理
            System.out.println("エラーが発生しました: " + e.getMessage());
        } finally {
            // Scannerをクローズ
            scanner.close();
        }
    }

    // 割り算を行うメソッド
    private static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            // 0で割る場合は例外をスロー
            throw new ArithmeticException("割る数に0が指定されています。");
        }
        return (double) dividend / divisor;
    }
}


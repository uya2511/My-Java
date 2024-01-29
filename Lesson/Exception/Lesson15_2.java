package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Lesson15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 整数の入力を受け取る
            System.out.print("整数を入力してください: ");
            int number = scanner.nextInt();

            // 偶数か奇数かを判定して表示
            if (isInteger(number)) {
                if (isEven(number)) {
                    System.out.println(number + " は偶数");
                } else {
                    System.out.println(number + " は奇数");
                }
            } else {
                System.out.println("整数と認識できません！");//int型じゃなっかった場合
            }

        } catch (InputMismatchException e) {
            // 整数以外が入力された場合の例外処理
            System.out.println("整数と認識できません！");
        } finally {
            // Scannerをクローズ
            scanner.close();
        }
    }

    // 整数かどうかを判定するメソッド
    private static boolean isInteger(int number) {
        return (number % 1 == 0);  // 整数であれば割り算の余りが0
    }

    // 偶数かどうかを判定するメソッド
    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}

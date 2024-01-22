package Lesson;

public class Lesson11_2 {
    class OperationExecutor {
        // クラス変数 x と y
        static int x;
        static int y;
    
        // 合計値を求めるメソッド
        static int sumFromXToY() {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            return sum;
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            // 変数 x と y に値を代入
            OperationExecutor.x = 100;
            OperationExecutor.y = 200;
    
            // 演算実行クラスのインスタンスを生成
            int result = OperationExecutor.sumFromXToY();
    
            // 結果の出力
            System.out.printf("%d から %d までの合計値は %d です。\n", OperationExecutor.x, OperationExecutor.y, result);
        }
    }
}

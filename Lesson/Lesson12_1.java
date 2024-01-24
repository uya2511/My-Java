package Lesson;
import java.util.Scanner;


    // Calculator クラス
class Calculator {
        // 2つの引数の合計値を返すメソッド
        public int calcSum(int num1, int num2) {
            return num1 + num2;
        }

        // 2つの引数の平均値を返すメソッド
        public double calcAve(int num1, int num2) {
            return (double) (num1 + num2) / 2;
        }
    }

    // MoreCalc クラスは Calculator クラスを継承したクラス
    class MoreCalc extends Calculator {
        // 引数の累乗を求めて返すメソッド
        public double calcPow(int base, int exponent) {
            return Math.pow(base, exponent);
        }
}


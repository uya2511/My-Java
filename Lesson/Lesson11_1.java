package Lesson;
import java.util.Scanner;

class Circle {
    // 円周率の定義
    static final double PI = 3.1415;

    // 半径
    double radius;

    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }

    // 円周の長さを求めるメソッド
    double calculateCircumference() {
        return 2 * PI * radius;
    }

    // 円の面積を求めるメソッド
    double calculateArea() {
        return PI * radius * radius;
    }
}

public class Lesson11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 半径の入力
        System.out.print("半径を整数値で入力：");
        double radius = scanner.nextDouble();

        // Circleクラスのインスタンスを生成
        Circle circle = new Circle(radius);

        // 円周の長さを計算
        double circumference = circle.calculateCircumference();

        // 円の面積を計算
        double area = circle.calculateArea();

        // 結果の出力
        System.out.printf("円周の長さは %.3f です。\n", circumference);
        System.out.printf("円の面積は %.3f です。\n", area);
    }
}

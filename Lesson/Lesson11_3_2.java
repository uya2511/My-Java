package Lesson;
import java.util.Scanner;
public class Lesson11_3_2 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("数字を入れてください");
        int x = a.nextInt();
        System.out.println("数字を入れてください");
        int y = a.nextInt();
        Lesson11_3 num = new Lesson11_3(x, y);
        System.out.println(x + "から" + y + "までの合計値は" + num.Totalvalue() + "です。");
    }
}

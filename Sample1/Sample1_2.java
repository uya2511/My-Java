package Sample1;
import java.util.*;
public class Sample1_2 {
    public static void main(String[] args) {
    //ArrayList のインスタンス化
    List<Integer> list = new ArrayList<>();
    //List に要素を追加
    list.add(0); list.add(1); print("要素を追加:", list);
    //List の index:1 に要素を挿
    list.add(1, 2); print("要素を挿入:", list);
    //list の index:1 の要素を削除
    list.remove(1); print("要素を削除:", list);
    //list の index:0 の要素を変更
    list.set(0, 10); print("要素を変更:", list);
    //list の要素を検索
    int index = list.indexOf(10);
    System.out.println("要素を検索:" + index);
    //list に要素が含まれるか確認
    boolean chk = list.contains(10);
    System.out.println("要素の確認:" + chk);
    //list の要素数
    int indexNum = list.size();
    System.out.println("要 素 数:" + indexNum);
    }
    //出力用メソッド
    static void print(String text, List<Integer> list) {
    System.out.print(text);
    //コレクションは拡張 for も使用可能
    for(int val : list) {
    System.out.print(val + " ");
    }
    System.out.println();
    }
}

package Lesson;

public class Lesson9_1 {
    
        // 学校名と名前を表示するメソッド
        static void displayInfo(String schoolName, String name) {
            System.out.println("学校名: " + schoolName);
            System.out.println("名前: " + name);
        }
    
        public static void main(String[] args) {
            // 自分の学校と名前を引数として渡して表示
            displayInfo("東京情報クリエイター工学院専門学校", "竹井一馬");
        }
    
}

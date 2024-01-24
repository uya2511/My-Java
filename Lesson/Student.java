package Lesson;

public class Student {
    private String name;        // 名前
    private int studentNumber;  //学生番号
    private int japaneseScore;  // 国語の点数
    private int mathScore;      // 数学の点数
    private int englishScore;   // 英語の点数
 
    // コンストラクタ
    public Student(int studentNumber, String name, int japaneseScore, int mathScore, int englishScore) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.japaneseScore = japaneseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }
 
    // 平均点を算出するメソッド
    public double calculateAverage() {
        return Math.floor((japaneseScore + mathScore + englishScore) / 3.0 * 100) / 100; // 3科目の平均点（小数点第2位以下切り捨て）

    }
 
    // 合計点を算出するメソッド
    public int calculateTotal() {
        return japaneseScore + mathScore + englishScore;
    }
 
    // 学生情報を表示するメソッド
    public void displayStudentInfo() {
        System.out.println(studentNumber + "番 " + name + "さん 平均点 " + calculateAverage());
    }
 
    public static void main(String[] args) {
        // 3人分の学生情報を作成
        Student student1 = new Student(1, "A", 89, 65, 88);
        Student student2 = new Student(2, "B", 80, 95, 64);
        Student student3 = new Student(3, "C", 70, 80, 98);
 
        // 学生情報を表示
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}

   

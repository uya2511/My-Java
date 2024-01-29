package Inheritance;

public class Lesson13_3 {
    // Person インターフェース
interface Person {
    void introduce();
}

// Teacher クラス
class Teacher implements Person {
    private String name;
    private String position;
    private String subject;

    // コンストラクタ
    public Teacher(String name, String position, String subject) {
        this.name = name;
        this.position = position;
        this.subject = subject;
    }

    // introduce メソッドの実装
    @Override
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + position);
        System.out.println("担当科目: " + subject);
    }
}

// Cook クラス
class Cook implements Person {
    private String name;
    private String position;
    private String specialty;

    // コンストラクタ
    public Cook(String name, String position, String specialty) {
        this.name = name;
        this.position = position;
        this.specialty = specialty;
    }

    // introduce メソッドの実装
    @Override
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + position);
        System.out.println("得意料理: " + specialty);
    }
}

// Main クラス
public class Main {
    public static void main(String[] args) {
        // Teacher クラスのインスタンス生成
        Teacher teacher = new Teacher("山田先生", "教師", "数学");

        // Cook クラスのインスタンス生成
        Cook cook = new Cook("田中シェフ", "シェフ", "フレンチ");

        // 教員の情報表示
        System.out.println("教員の情報:");
        teacher.introduce();

        System.out.println();

        // シェフの情報表示
        System.out.println("シェフの情報:");
        cook.introduce();
    }
}

}

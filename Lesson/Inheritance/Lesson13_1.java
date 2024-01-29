package Inheritance;

public class Lesson13_1 {
    
    // メインクラス
    public static void main(String[] args) {
        // Teacher クラスのインスタンス生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");

        // Cook クラスのインスタンス生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");

        // 自己紹介
        System.out.println("教師の情報:");
        teacher.introduce();

        System.out.println("\nコックの情報:");
        cook.introduce();
    }
}
class Person {
    private String name;
    private String job;

    // コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    // 自己紹介メソッド
    public void introduce() {
        System.out.println("私の名前は" + name + "で、年齢は" + job + "歳です。");
    }
}

// Teacher クラスは Person クラスを継承したクラス
class Teacher extends Person {
    private String subject;

    // コンストラクタ
    Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    // 自己紹介メソッド（オーバーライド）
    @Override
    public void introduce() {
        super.introduce();  // 親クラスの introduce メソッド呼び出し
        System.out.println("担当科目は" + subject + "です。");
    }
}

// Cook クラスは Person クラスを継承したクラス
class Cook extends Person {
    private String specialty;

    // コンストラクタ
    public Cook(String name, String job, String specialty) {
        super(name, job);
        this.specialty = specialty;
    }

    // 自己紹介メソッド（オーバーライド）
    @Override
    public void introduce() {
        super.introduce();  // 親クラスの introduce メソッド呼び出し
        System.out.println("得意料理は" + specialty + "です。");
    }
}
    


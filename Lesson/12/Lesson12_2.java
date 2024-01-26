

public class Lesson12_2 {
    // メインクラス
    public static void main(String[] args) {
        // Teacher クラスのインスタンス生成
        Teacher teacher = new Teacher("山田先生", 35, "数学");

        // Cook クラスのインスタンス生成
        Cook cook = new Cook("田中シェフ", 40, "フレンチ");

        // 自己紹介
        System.out.println("教師の情報:");
        teacher.introduce();

        System.out.println("\nコックの情報:");
        cook.introduce();
    }
}
class Person {
    private String name;
    private int age;

    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 自己紹介メソッド
    public void introduce() {
        System.out.println("私の名前は" + name + "で、年齢は" + age + "歳です。");
    }
}

// Teacher クラスは Person クラスを継承したクラス
class Teacher extends Person {
    private String subject;

    // コンストラクタ
    Teacher(String name, int age, String subject) {
        super(name, age);
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
    public Cook(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    // 自己紹介メソッド（オーバーライド）
    @Override
    public void introduce() {
        super.introduce();  // 親クラスの introduce メソッド呼び出し
        System.out.println("得意料理は" + specialty + "です。");
    }
}

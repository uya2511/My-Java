
public class Lesson13_1 {
    // メインクラス
    public static void main(String[] args) {
        // Teacher クラスのインスタンス生成
        Teacher teacher = new Teacher("山田先生","教員", "数学");

        // Cook クラスのインスタンス生成
        Cook cook = new Cook("田中シェフ", "シェフ", "フレンチ");

        // 自己紹介
        System.out.println("教師の情報:");
        teacher.introduce();

        System.out.println("\nコックの情報:");
        cook.introduce();
    }
}
abstract class Person {
    private String name;
    private String job;

    // コンストラクタ
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }


    // 自己紹介メソッド
    public abstract void introduce();
}

// Teacher クラスは Person クラスを継承したクラス
class Teacher extends Person {
    private String subject;

    // コンストラクタ
    Teacher(String name,String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    

    public String getSubject() {
        return subject;
    }



    // 自己紹介メソッド（オーバーライド）
    @Override
    public void introduce() {
        System.out.println("担当科目は" + subject + "です。");
    }
}

// Cook クラスは Person クラスを継承したクラス
class Cook extends Person {
    private String specialty;

    // コンストラクタ
    Cook(String n,String j,String sp){
        super(n, j);
        this.specialty=sp;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getJob() {
        return super.getJob();
    }

    public String getSpecialty() {
        return specialty;
    }


    // 自己紹介メソッド（オーバーライド）
    @Override
    public void introduce() {
        System.out.println("得意料理は" + specialty + "です。");
    }
}
package Lesson;

public class Lesson9_2 {
   
        // "Hello"を指定回数繰り返し表示するメソッド
        static void displayHello(int count) {
            for (int i = 0; i < count; i++) {
                System.out.println("Hello");
            }
        }
    
        public static void main(String[] args) {
            // "Hello"を10回表示する
            displayHello(10);
        }
    }


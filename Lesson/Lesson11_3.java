package Lesson;

public class Lesson11_3 {
    int x;
    int y;

    Lesson11_3(int x, int y){
        this.x = x;
        this.y = y;
    }

    int Totalvalue(){
        int sum = 0;
        for(int i = x; i <= y; i ++){
        sum += i;    
        }
        return sum;
    }

}


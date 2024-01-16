package Lesson;

import java.util.HashMap;
import java.util.Map;

public class Lesson8_14 {
    public static void main(String[] args) {
        // 連想配列を作成
        Map<String, String> vegetableSeasons = new HashMap<>();
        vegetableSeasons.put("キャベツ", "春");
        vegetableSeasons.put("スイカ", "夏");
        vegetableSeasons.put("ナス", "秋");
        vegetableSeasons.put("ハクサイ", "冬");

        // 連想配列の要素を全て表示
        for (Map.Entry<String, String> entry : vegetableSeasons.entrySet()) {
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
    }
}

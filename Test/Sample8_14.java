package Test;

import java.util.HashMap;
import java.util.Map;

class Sample8_14 {
    public static void main(String[] args){
        /* # 作成した連想配列の値を表示 */
        
        /* # 連想配列を作成 */
    	Map<String, String> vegetable_dict = (__x__) {
            {
            	(__x__);
            	(__x__);
            	(__x__);
            	(__x__);
            	(__x__);
            }
        };

        /* # 連想配列の全要素を表示 */
        for (Map.Entry<String, String> entry : vegetable_dict.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

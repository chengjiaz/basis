
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhangjiacheng
 * @description: 统计字符串中字符出现的次数
 * @date 2019/10/11 9:53
 */
@Slf4j
public class CountCharNum {

    public static void main(String[] args) {
        // (1)定义字符串
        String str = "jfdafasfsfasf";

        // (2)定义map容器
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        //(3)遍历str
        for (int i = 0; i < str.length(); i++) {

                          //charAt():返回指定索引处的字符
            char ch = str.charAt(i);

            //(4)判定字符是否已经存在
            //(4.1)如果存在,出现次数+1
            //(4.2)如果不存在,出现次数设置为1
            //containsKey():是否包含置顶的key
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                count = count + 1;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }
        // (5)遍历map集合
        Set<Character> keySet = map.keySet();
        for (Character chars : keySet) {
            log.info("字符:【{}】,出现:【{}】次",chars,map.get(chars));
        }
    }
}

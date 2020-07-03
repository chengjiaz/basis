package jia.test.pinyin4j;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.pinyin4j.PinyinHelper;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Pinyin4jTest {
    public static void main(String[] args) {

        //准备测试数据
        List preList = new ArrayList<>();
        preList.add("黑旋风李逵");
        preList.add("及时雨宋江");
        preList.add("玉麒麟卢俊义");
        preList.add("入云龙公孙胜");
        preList.add("浪子燕青");

        //测试数据处理
        List resultList = new ArrayList<>();
        if(preList != null && preList.size()>0){
            for(int i=0;i<preList.size();i++){
                resultList.add(getHanziPinYin(preList.get(i).toString()));
            }
        }

        //结果输出
        if(resultList !=null && resultList.size()>0){
            for(int i=0;i<resultList.size();i++){
                log.info("result:【{}】",resultList.get(i));
            }
        }

    }


    public static String getHanziPinYin(String hanzi) {
        String result = null;
        if(null != hanzi && !"".equals(hanzi)) {
            char[] charArray = hanzi.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (char ch : charArray) {
                String[] stringArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if(null != stringArray) {
                    sb.append(stringArray[0].replaceAll("\\d", ""));
                }
            }
            if(sb.length() > 0) {
                result = sb.toString();
            }
        }
        return result;
    }
}

package com.jia.basis.common.utils;


import java.util.Date;
import java.util.UUID;

/**
 * @author zhangjiacheng
 * @description: 全局唯一id生成工具类
 * @date 2019/12/16 16:39
 */
public class IdUtils
{
    private static final String BASE32_ALPHABET = "ABCDEFGHIJKLMNoPQRSTUVWXYZ234567";

    public static String getUniqueId() {
        String uuid = UUID.randomUUID().toString();
        return uuidToBase32(uuid);
    }

    public static String uuidToBase32(String uuid) {
        String binaryString = uuidToBinaryString(uuid);
        return toBase32(binaryString);
    }

    private static String uuidToBinaryString(String uuid) {
        StringBuilder result = new StringBuilder();
        for (char c : uuid.toCharArray()) {
            if (c != '-') {
                String binaryString = Integer.toBinaryString(Integer.parseInt(String.valueOf(c), 16));
                binaryString = "0000" + binaryString;
                binaryString = binaryString.substring(binaryString.length() - 4);
                result.append(binaryString);
            }
        }  return result.toString();
    }




    public static String getGenerateNumber() {
        Long dt = Long.valueOf(System.currentTimeMillis());
        return dt.toString();
    }


    public static String GenerateCardNo() {
        Date day = new Date();
        return String.valueOf(day.getTime() / 1000L);
    }


    public static String GenerateOptCardNo() {
        Date day = new Date();

        return String.valueOf(day.getTime() / 1000L + 315360000L);
    }





    private static String toBase32(String binaryString) {
        int binaryStringLength = binaryString.length();
        int loopMax = (binaryStringLength + 4) / 5;
        binaryString = binaryString + "0000";
        StringBuilder base32Str = new StringBuilder();
        for (int loopIndex = 0; loopIndex < loopMax; loopIndex++) {
            String s = binaryString.substring(loopIndex * 5, loopIndex * 5 + 5);
            int val = Integer.parseInt(s, 2);
            base32Str.append("ABCDEFGHIJKLMNoPQRSTUVWXYZ234567".charAt(val));
        }

        return base32Str.toString();
    }
}

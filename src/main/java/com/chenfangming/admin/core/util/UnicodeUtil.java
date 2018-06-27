package com.chenfangming.admin.core.util;

/**
 * @author fangming.chen
 * @since 2018-06-13 12：33
 * Email cfmmail@sina.com
 * Description Unicode工具类
 */
public class UnicodeUtil {

    /**
     * 可阅读的字符串转为Unicode格式的字符串
     * @param source Unicode格式的字符串
     * @return 可阅读的字符串
     */
    public static String toUnicode(String source) {
        if (null == source) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = source.toCharArray();
        for (char item : charArray) {
            String unicode = Integer.toHexString(item);
            sb.append("\\u").append(unicode);
        }
        return sb.toString();
    }

    /**
     * Unicode格式的字符串转为可阅读的字符串
     * @param unicode Unicode格式的字符串
     * @return 可阅读的字符串
     */
    public static String fromUnicode(String unicode) {
        if (null == unicode) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] hexArray = unicode.split("\\\\u");
        for (int i = 1; i < hexArray.length; i++) {
            int data = Integer.parseInt(hexArray[i], 16);
            sb.append((char) data);
        }
        return sb.toString();
    }
}

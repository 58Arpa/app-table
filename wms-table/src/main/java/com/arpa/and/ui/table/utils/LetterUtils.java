package com.arpa.and.ui.table.utils;

public class LetterUtils {

    public static String ToNumberSystem26(int n) {
        String s = "";
        while (n > 0) {
            int m = n % 26;
            if (m == 0) m = 26;
            s = (char) (m + 64) + s;
            n = (n - m) / 26;
        }
        return s;
    }

    public static boolean isBasicType(Object data) {
        return data != null && data instanceof Number;
    }

    public static boolean isNumber(Object data) {
        return !(data instanceof Float || data instanceof Double);
    }
}

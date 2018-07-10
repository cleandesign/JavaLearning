package com.woshidaniu.effective;

/**
 * Created by kang on 2018/7/9.
 */
public class stringbuilder_stringbuffer {
    public static void main(String[] args)
    {
        String a = "a";
        String b = "b";
        String c = "c";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            String string = a + b + c;
            if (string.equals("abc")) {}
        }
        System.out.println("string+ cost time:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a);
            stringBuffer.append(b);
            stringBuffer.append(c);
            String string = stringBuffer.toString();
            if (string.equals("abc")) {}
        }
        System.out.println("stringbuffer cost time:" + (System.currentTimeMillis() - start) + "ms");
    }
}

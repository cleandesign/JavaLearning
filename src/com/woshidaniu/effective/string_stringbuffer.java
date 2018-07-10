package com.woshidaniu.effective;

/**
 * Created by kang on 2018/7/9.
 */
//而对于上面这个10万次循环的程序，stringbuffer就不用说了，实际运行的方式很明显。而对于string+，它将会创造10万个stringbuilder对象，每一次循环体的发生，都相当于我们新建了一个stringbuilder对象，将string对象作为构造函数的参数，并进行一次append方法和一次toString方法。
//
//        　　由上面几个小程序我们可以看出，在string+写成一个表达式的时候（更准确的说，是写成一个赋值语句的时候），效率其实比stringbuffer更快，但如果不是这样的话，则效率会明显低于stringbuffer。我们来再写一个程序证实这一点。
public class string_stringbuffer {
    public static void main(String[] args)
    {
        String a = "a";
        long start = System.currentTimeMillis();
        String string = a;
        for (int i = 0; i < 100000; i++) {
            string += a;
        }
        if (string.equals("abc")) {}
        System.out.println("string+ cost time:" + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(a);
        }
        if (stringBuffer.toString().equals("abc")) {}
        System.out.println("stringbuffer cost time:" + (System.currentTimeMillis() - start) + "ms");
    }
}

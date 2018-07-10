package com.woshidaniu.effective;

/**
 * Created by kang on 2018/7/9.
 */
public class stringadd_stringbuffer {
    public static void main(String[] args){
        /*   1   */
        String string = "a" + "b" + "c";
        /*   2   */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        string = stringBuffer.toString();
    }
//    public static void main(String[] args){
//        /*   1   */
//        String a = "a";
//        String b = "b";
//        String c = "c";
//        String string = a + b + c;
//        /*   2   */
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append(a);
//        stringBuffer.append(b);
//        stringBuffer.append(c);
//        string = stringBuffer.toString();
//    }

}

package com.woshidaniu.effective;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by kang on 2018/7/4.
 */
public class MapKeyValue {
    public static void main(String[] args)
    {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("111", "222");

        Set<Map.Entry<String, String>> entrySet = hm.entrySet();

        Iterator<Map.Entry<String, String>> iter = entrySet.iterator();
        while (iter.hasNext())
        {
            Map.Entry<String, String> entry = iter.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }


        Set<String> keySet = hm.keySet();
        Iterator< String> iter1 = keySet.iterator();
        while (iter1.hasNext())
        {
            String entry = iter1.next();
            System.out.println(entry);
        }
    }
}
//如果你只是想遍历一下这个Map的key值，那用"Set<String> keySet = hm.keySet();"会比较合适一些


package com.woshidaniu.designpattern.行为.备忘录;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kang on 2018/7/8.
 */
//public class Soul {
//
//    private Memory memory;
//
//    //抽离或者说搜集一个人的记忆
//    public void pullAwayMemory(Person person){
//        memory = person.getMemory();
//    }
//
//    //强行将一个人的记忆固定在某一刻
//    public void forceFixMemory(Person person){
//        person.setMemory(memory);
//    }
//}
public class Soul {

    private Map<Person, Memory> memoryMap = new HashMap<Person, Memory>();

    //抽离或者说搜集一个人的记忆
    public void pullAwayMemory(Person person){
        memoryMap.put(person, person.getMemory());
    }

    //强行将一个人的记忆固定在某一刻
    public void forceFixMemory(Person person){
        if (memoryMap.containsKey(person)) {
            person.setMemory(memoryMap.get(person));
        }
    }
}
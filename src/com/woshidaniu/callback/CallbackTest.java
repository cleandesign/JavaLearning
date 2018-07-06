package com.woshidaniu.callback;

import org.junit.Test;

/**
 * Created by kang on 2018/7/4.
 */
public class CallbackTest {

    @Test
    public void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);

        teacher.askQuestion();

    }

}
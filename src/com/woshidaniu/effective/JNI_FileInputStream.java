package com.woshidaniu.effective;

import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kang on 2018/7/9.
 */
public class JNI_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileDescriptor descriptor  = FileDescriptor.out;
        FileWriter fileWriter = new FileWriter(descriptor);
        fileWriter.write("hello world");
        fileWriter.flush();
        fileWriter.close();
    }
}

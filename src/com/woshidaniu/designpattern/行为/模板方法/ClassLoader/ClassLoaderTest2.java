package com.woshidaniu.designpattern.行为.模板方法.ClassLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kang on 2018/7/7.
 */
//              对于类加载器比较熟悉的读者们可能觉得这个结果并不出乎意料，可是或许还是有人会比较意外，为什么结果会是false呢？
//
//                      这是因为如果没有按照ClassLoader中提供的骨架算法去加载类的话，可能会造成JVM中有两个一模一样的类信息，他们是来自一个类文件，但却不是一个加载器加载的，所以这两个类不相等。
//
//                      这也是类加载器为何要使用模板模式给我们定义好查找的算法，是为了保证我们加载的每一个类在虚拟机当中都有且仅有一个。
//
//                      不过你可能会想，既然如此，为何不把loadClass方法写成final类型的，这样不是更安全吗？
//
//                      这是因为有的时候我们希望JVM当中每一个类有且仅有一个，但有的时候我们希望有两个，甚至N个，就比如我们的tomcat，你可以想象下，你每一个项目假设都有com.xxx.xxxx.BaseDao等等，如果这些类都是一个的话，你的tomcat还能同时启动多个WEB服务吗？虽说tomcat也是遵循的双亲委派模型，但是从此也可以看出来，我们并不是在所有时候都希望同一个全限定名的类在整个JVM里面只有一个。
//
//                      这里提到类加载器，是为了给模板方法一个现有的现实中的例子，以便于有些看多了自己制造的例子的读者可以换个口味，如果有机会，LZ会在这个系列完结以后，专门开一个系列来和各位分享学习虚拟机过程中的感悟，本次不再过多介绍类加载器的相关内容。
class MyClassLoader extends ClassLoader{

        public Class<?> loadClass(String name) throws ClassNotFoundException {
            String fileName = name.substring(name.lastIndexOf(".")+1) + ".class";
            InputStream is = getClass().getResourceAsStream(fileName);
            if (is == null) {
                return super.loadClass(name);
            }
            try {
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name, b, 0, b.length);
            } catch (IOException e) {
                throw new ClassNotFoundException();
            }
        }

}
public class ClassLoaderTest2 {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ClassLoader classLoader = new MyClassLoader();
        Class<?> clazz = classLoader.loadClass("com.woshidaniu.designpattern.行为.模板方法.ClassLoader.ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest2);
    }

}



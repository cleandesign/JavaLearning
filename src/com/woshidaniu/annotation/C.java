package com.woshidaniu.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by kang on 2018/7/2.
 */



public class C {
    /**
     * 简单打印出B类中所使用到的类注解
     * 该方法只打印了 Type 类型的注解
     * @throws ClassNotFoundException
     */
    public static void parseTypeAnnotation() throws ClassNotFoundException{
        Class clazz = Class.forName("com.woshidaniu.annotation.B");

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation :annotations){
            A a = (A)annotation;
            System.out.println("id = "+a.id()+" ;name = "+a.name()+" ;gid = "+a.gid());
        }

    }

    /**
     * 简单打印出B类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     */
    public static void parseMethodAnnotation() {
        Method[] methods = B.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
             * 判断方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = method.isAnnotationPresent(A.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                A annotation = method.getAnnotation(A.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    /**
     * 简单打印出B类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     */
    public static void parseConstructAnnotation(){
        Constructor[] constructors = B.class.getConstructors();
        for (Constructor constructor : constructors) {
            /*
             * 判断构造方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = constructor.isAnnotationPresent(A.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                A annotation =(A) constructor.getAnnotation(A.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
        parseMethodAnnotation();
        parseConstructAnnotation();
    }

}
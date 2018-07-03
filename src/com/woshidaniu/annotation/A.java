package com.woshidaniu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kang on 2018/7/2.
 */

//元注解
//        元注解的作用就是负责注解其他注解。四个元注解分别是：@Target,@Retention,@Documented,@Inherited
//
//@Retention
//表示在什么级别保存该注解信息。可选的参数值在枚举类型 RetentionPolicy中，包括RetentionPolicy.SOURCE,RetentionPolicy.CLASS(默认),RetentionPolicy.RUNTIME分别对应：java源文件–>class文件–>内存中的字节码
//
//        RetentionPolicy.SOURCE 注解将被编译器丢弃
//        RetentionPolicy.CLASS 注解在class文件中可用，但会被VM丢弃
//        RetentionPolicy.RUNTIME VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。

//@Target
//表示该注解用于什么地方，可能的值在枚举类ElemenetType中,包括
//
//        ElemenetType.CONSTRUCTOR 构造器声明
//        ElemenetType.FIELD 域声明（包括 enum 实例）
//        ElemenetType.LOCAL_VARIABLE 局部变量声明
//        ElemenetType.METHOD 方法声明
//        ElemenetType.PACKAGE 包声明
//        ElemenetType.PARAMETER 参数声明
//        ElemenetType.TYPE 类，接口（包括注解类型）或enum声明

//@Documented
//将此注解包含在javadoc中 ，它代表着此注解会被javadoc工具提取成文档。在doc文档中的内容会因为此注解的信息内容不同而不同。相当于@see,@param等
//
//@Inherited
//允许子类继承父类中的注解
//
//        自定义注解
//        使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。在定义注解时，不能继承其他的注解或接口。@interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。可以通过default来声明参数的默认值。
//
//        定义注解格式：
//
//public @interface 注解名 {定义体}
//
//注解参数的可支持数据类型：
//
//        1.所有基本数据类型(int,float,boolean,byte,double,char,long,short)
//        2.String类型
//        3.Class类型
//        4.enum类型
//        5.Annotation类型
//        6.以上所有类型的数组

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface A {
    String name();
    int id() default 0;
    Class<Long> gid();
}
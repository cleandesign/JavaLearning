package com.woshidaniu.Java_Interview.Java_Interview.src.main.java.com.crossoverjie.design.pattern.factorymethod;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 19/03/2018 15:21
 * @since JDK 1.8
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}

package com.gfy.design.jdecorator.component;

/**
 * @author gfy
 * <p>
 * 具体构件类
 */
public class ConcreteEncodeComponent implements EncodeComponent {

    @Override
    public void encode() {
        System.out.println("普通加密算法");
    }
}

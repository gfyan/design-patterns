package com.gfy.design.jdecorator.decorator;

import com.gfy.design.jdecorator.component.EncodeComponent;

/**
 * @author gfy
 * <p>
 * 具体装饰类
 */
public class ConcreteDecoratorEncodeComponent extends DecoratorEncodeComponent {

    public ConcreteDecoratorEncodeComponent(EncodeComponent encodemponent) {
        super(encodemponent);
    }

    @Override
    protected void encodeM() {
        System.out.println("二级加密算法");
    }


}

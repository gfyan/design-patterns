package com.gfy.design.jdecorator.decorator;

import com.gfy.design.jdecorator.component.EncodeComponent;

/**
 * @author gfy
 * <p>
 * 装饰抽象构件
 */
public abstract class DecoratorEncodeComponent implements EncodeComponent {

    public EncodeComponent encodemponent;

    public DecoratorEncodeComponent(EncodeComponent encodemponent) {
        this.encodemponent = encodemponent;
    }

    /**
     * 二级加密方法
     */
    protected abstract void encodeM();

    @Override
    public void encode() {
        encodemponent.encode();
        this.encodeM();
    }
}

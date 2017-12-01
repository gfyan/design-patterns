package com.gfy.design.lflyweight.flyweight;

/**
 * @author gfy
 * <p>
 * 抽象享元类
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display() {
        System.out.println("棋子的颜色是" + this.getColor());
    }

}

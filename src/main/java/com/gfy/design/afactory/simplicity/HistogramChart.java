package com.gfy.design.afactory.simplicity;

/**
 * @author gfy
 * <p>
 * 具体产品类
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}

package com.gfy.design.a.factory.simplicity;

/**
 * @author gfy
 * <p>
 * 工厂类
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if ("histogram".equals(type)) {
            chart = new HistogramChart();
        } else if ("line".equals(type)) {
            chart = new LineChart();
        } else {
            chart = new LineChart();
        }
        return chart;
    }


}

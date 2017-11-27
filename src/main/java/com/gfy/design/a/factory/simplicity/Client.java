package com.gfy.design.a.factory.simplicity;

/**
 * @author gfy
 * <p>
 * 客户端
 */
public class Client {


    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("line");
        chart.display();
    }

}

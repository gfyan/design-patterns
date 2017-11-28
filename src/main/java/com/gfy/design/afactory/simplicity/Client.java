package com.gfy.design.afactory.simplicity;

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

package com.gfy.design.d.singleton;

/**
 * @author gfy
 * <p>
 * 客户端  这是单例测试用例，用例详情：
 * <p>
 * 创建一个当前系统的任务概述
 */
public class Client {

    public static void main(String[] args) {
        TaskSingleton taskSingleton = TaskSingleton.getInstance();
        taskSingleton.display();
    }

}

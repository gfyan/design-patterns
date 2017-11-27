package com.gfy.design.d.singleton;

/**
 * @author gfy
 */
public class TaskSingleton {

    private TaskSingleton() {
        //私有化构造函数
    }

    private static class Task {
        static {
            System.out.println("实例化taskSingleton单例类");
        }

        private final static TaskSingleton singleton = new TaskSingleton();
    }

    public static TaskSingleton getInstance() {
        return Task.singleton;
    }

    public void display() {
        System.out.println("当前任务量为：" + 0);
    }

}

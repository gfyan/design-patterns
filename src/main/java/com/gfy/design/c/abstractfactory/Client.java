package com.gfy.design.c.abstractfactory;

import com.gfy.design.c.abstractfactory.factory.AndroidFactory;
import com.gfy.design.c.abstractfactory.factory.Factory;
import com.gfy.design.c.abstractfactory.interfaceC.InterfaceController;
import com.gfy.design.c.abstractfactory.operation.OperationController;

/**
 * @author gfy
 * <p>
 * 客户端  这是抽象工厂用例，用例详情：
 * <p>
 * 设计一款软件该软件能够支持Symbian、Android和
 * Windows Mobile等多个智能手机操作系统平台，针对不同的手机操作系统，该游戏软件提
 * 供了不同的游戏操作控制(OperationController)类和游戏界面控制(InterfaceController)类，
 * 并提供相应的工厂类来封装这些类的初始化过程。
 */
public class Client {


    public static void main(String[] args) {
        Factory factory = null;
        InterfaceController interfaceController = null;
        OperationController operationController = null;

        factory = new AndroidFactory();
        interfaceController = factory.createInterfaceController();
        operationController = factory.createOperationController();
        operationController.operation();
        interfaceController.interfaceA();
    }

}

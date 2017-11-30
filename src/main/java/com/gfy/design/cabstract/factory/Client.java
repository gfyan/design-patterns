package com.gfy.design.cabstract.factory;

import com.gfy.design.cabstract.factory.factory.AndroidFactory;
import com.gfy.design.cabstract.factory.factory.Factory;
import com.gfy.design.cabstract.factory.interfaceC.InterfaceController;
import com.gfy.design.cabstract.factory.operation.OperationController;

/**
 * 抽象工厂模式为创建一组对象提供了一种解决方案。与工厂方法模式相比，抽象工厂模式中
 * 的具体工厂不只是创建一种产品，它负责创建一族产品。
 * <p>
 * 抽象工厂模式(Abstract Factory Pattern)：
 * 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为Kit模式，它是一种对象创建型模式。
 * 在抽象工厂模式中，每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的产品，
 * 这些产品构成了一个产品族
 * <p>
 * <p>
 * <p>
 * 客户端  这是抽象工厂用例。
 * <p>
 * 用例详情：设计一款软件该软件能够支持Symbian、Android和
 * Windows Mobile等多个智能手机操作系统平台，针对不同的手机操作系统，该游戏软件提
 * 供了不同的游戏操作控制(OperationController)类和游戏界面控制(InterfaceController)类，
 * 并提供相应的工厂类来封装这些类的初始化过程。
 *
 * @author gfy
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

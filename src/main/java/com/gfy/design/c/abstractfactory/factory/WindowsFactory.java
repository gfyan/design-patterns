package com.gfy.design.c.abstractfactory.factory;

import com.gfy.design.c.abstractfactory.interfaceC.InterfaceController;
import com.gfy.design.c.abstractfactory.interfaceC.WindowsInterfaceController;
import com.gfy.design.c.abstractfactory.operation.OperationController;
import com.gfy.design.c.abstractfactory.operation.WindowsOperationController;

/**
 * @author gfy
 */
public class WindowsFactory implements Factory {

    @Override
    public OperationController createOperationController() {
        System.out.println("开始创建windows界面类");
        OperationController operationController = null;
        operationController = new WindowsOperationController();
        System.out.println("创建windows界面类完毕");
        return operationController;
    }

    @Override
    public InterfaceController createInterfaceController() {
        System.out.println("开始创建windows操作类");
        InterfaceController interfaceController = null;
        interfaceController = new WindowsInterfaceController();
        System.out.println("创建windows操作类完毕");
        return interfaceController;
    }
}

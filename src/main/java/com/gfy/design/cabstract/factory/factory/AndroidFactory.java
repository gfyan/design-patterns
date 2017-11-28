package com.gfy.design.cabstract.factory.factory;

import com.gfy.design.cabstract.factory.interfaceC.AndroidInterfaceController;
import com.gfy.design.cabstract.factory.interfaceC.InterfaceController;
import com.gfy.design.cabstract.factory.operation.AndroidOperationController;
import com.gfy.design.cabstract.factory.operation.OperationController;

/**
 * @author gfy
 */
public class AndroidFactory implements Factory {

    @Override
    public OperationController createOperationController() {
        System.out.println("开始创建Android界面类");
        OperationController operationController = null;
        operationController = new AndroidOperationController();
        System.out.println("创建Android界面类完毕");
        return operationController;
    }

    @Override
    public InterfaceController createInterfaceController() {
        System.out.println("开始创建Android操作类");
        InterfaceController interfaceController = null;
        interfaceController = new AndroidInterfaceController();
        System.out.println("创建Android操作类完毕");
        return interfaceController;
    }
}

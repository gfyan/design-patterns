package com.gfy.design.cabstract.factory.factory;

import com.gfy.design.cabstract.factory.interfaceC.InterfaceController;
import com.gfy.design.cabstract.factory.interfaceC.SymbianInterfaceController;
import com.gfy.design.cabstract.factory.operation.OperationController;
import com.gfy.design.cabstract.factory.operation.SymbianOperationController;

/**
 * @author gfy
 */
public class SymbianFactory implements Factory {

    @Override
    public OperationController createOperationController() {
        System.out.println("开始创建塞班界面类");
        OperationController operationController = null;
        operationController = new SymbianOperationController();
        System.out.println("创建塞班界面类完毕");
        return operationController;
    }

    @Override
    public InterfaceController createInterfaceController() {
        System.out.println("开始创建塞班操作类");
        InterfaceController interfaceController = null;
        interfaceController = new SymbianInterfaceController();
        System.out.println("创建塞班操作类完毕");
        return interfaceController;
    }
}

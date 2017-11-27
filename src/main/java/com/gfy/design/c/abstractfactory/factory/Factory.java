package com.gfy.design.c.abstractfactory.factory;

import com.gfy.design.c.abstractfactory.interfaceC.InterfaceController;
import com.gfy.design.c.abstractfactory.operation.OperationController;

/**
 * @author gfy
 * <p>
 * 工厂方法
 */
public interface Factory {

    /**
     * 创建操作类
     *
     * @return
     */
    public OperationController createOperationController();

    /**
     * 创建界面类
     *
     * @return
     */
    public InterfaceController createInterfaceController();

}

package com.gfy.design.cabstract.factory.factory;

import com.gfy.design.cabstract.factory.interfaceC.InterfaceController;
import com.gfy.design.cabstract.factory.operation.OperationController;

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

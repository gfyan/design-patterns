package com.gfy.design.c.abstractfactory.operation;

import com.gfy.design.c.abstractfactory.operation.OperationController;

/**
 * @author gfy
 */
public class WindowsOperationController implements OperationController {

    @Override
    public void operation() {
        System.out.println("这是安卓系统操作控制");
    }
}

package com.gfy.design.c.abstractfactory.operation;

/**
 * @author gfy
 */
public class AndroidOperationController implements OperationController {

    @Override
    public void operation() {
        System.out.println("这是安卓系统操作控制");
    }
}

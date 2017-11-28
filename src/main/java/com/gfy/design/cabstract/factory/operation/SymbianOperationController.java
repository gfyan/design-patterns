package com.gfy.design.cabstract.factory.operation;

/**
 * @author gfy
 * <p>
 * 具体产品  塞班系统
 */
public class SymbianOperationController implements OperationController {

    @Override
    public void operation() {
        System.out.println("这是塞班系统操作控制");
    }

}

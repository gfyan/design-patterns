package com.gfy.design.mproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author gfy
 * <p>
 * 动态代理类
 */
public class DynamicsProxy {

    /**
     * 代理的目标类
     */
    private Object target;

    public DynamicsProxy(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("执行方法之前。。。");
                Object returnValue = method.invoke(target, args);
                System.out.println("执行方法之后。。。");
                return returnValue;
            }
        });
    }

}

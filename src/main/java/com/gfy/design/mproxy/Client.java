package com.gfy.design.mproxy;

import com.gfy.design.mproxy.proxy.DynamicsProxy;
import com.gfy.design.mproxy.realsubject.User;
import com.gfy.design.mproxy.subject.IUser;

/**
 * 代理模式：给某一个对象提供一个代理或占位符，并由代理对象来控制对原对象的访问。
 * <p>
 * 代理模式是一种对象结构型模式。在代理模式中引入了一个新的代理对象，代理对象在客户
 * 端对象和目标对象之间起到中介的作用，它去掉客户不能看到的内容和服务或者增添客户需
 * 要的额外的新服务。
 * <p>
 * <p>
 * <p>
 * 客户端，这是代理模式用例代码。
 *
 * @author gfy
 */
public class Client {

    public static void main(String[] args) {
        IUser user = new User();
        //生成代理对象
        DynamicsProxy dynamicsProxy = new DynamicsProxy(user);
        IUser proxy = (IUser) dynamicsProxy.getProxyInstance();

        proxy.whetherTheSingle();
    }

}

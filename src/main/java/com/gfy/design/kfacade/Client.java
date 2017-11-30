package com.gfy.design.kfacade;

import com.gfy.design.kfacade.facade.AbstractFacade;
import com.gfy.design.kfacade.facade.ConcreteFacade;

/**
 * 外观模式：为子系统中的一组接口提供一个统一的入口。外观模式定义
 * 了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 外观模式又称为门面模式，它是一种对象结构型模式。外观模式是迪米特法则的一种具体实
 * 现，通过引入一个新的外观角色可以降低原有系统的复杂度，同时降低客户类与子系统的耦
 * 合度
 * <p>
 * <p>
 * <p>
 * 这是外观者模式用例代码
 * <p>
 * 用例详情：
 *
 * @author gfy
 */
public class Client {

    public static void main(String[] args) {
        AbstractFacade facade = new ConcreteFacade();
        facade.method();
    }

}

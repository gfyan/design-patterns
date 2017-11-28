package com.gfy.design.eprototype;

import com.gfy.design.eprototype.deepcopy.Customer;

/**
 * @author gfy
 * <p>
 * 客户端  这是原型模式测试用例，用例详情：
 * <p>
 * 实现一个客户类Customer，其中包含一个名为客户地址的成员变量，客户地址的类
 * 型为Address
 */
public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        customer.setAddress(address);
        //赋值对象
        Customer customer1 = customer.clone();
        System.out.println(customer.getAddress() == customer1.getAddress());

        com.gfy.design.eprototype.shallowcopy.Customer customer2 = new com.gfy.design.eprototype.shallowcopy.Customer();
        customer2.setAddress(address);
        com.gfy.design.eprototype.shallowcopy.Customer customer3 = customer2.clone();
        System.out.println(customer2.getAddress() == customer3.getAddress());
    }

}

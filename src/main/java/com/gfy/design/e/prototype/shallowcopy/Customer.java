package com.gfy.design.e.prototype.shallowcopy;

import com.gfy.design.e.prototype.Address;

import java.io.*;

/**
 * @author gfy
 * <p>
 * 浅复制原型类
 */
public class Customer implements Cloneable, Serializable {

    private String name;

    private Integer age;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Customer clone() {
        Customer customer = null;
        try {
            customer = (Customer) super.clone();
            return customer;
        } catch (Exception e) {
            System.out.println("对象不可复制");
        }
        return null;
    }
}

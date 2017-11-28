package com.gfy.design.eprototype.deepcopy;

import com.gfy.design.eprototype.Address;

import java.io.*;

/**
 * @author gfy
 * <p>
 * 深复制原型类
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
            //将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //从流中取出来，并生成新的对象
            ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bai);
            customer = (Customer) ois.readObject();
            return customer;
        } catch (Exception e) {
            System.out.println("对象不可复制");
        }
        return null;
    }
}

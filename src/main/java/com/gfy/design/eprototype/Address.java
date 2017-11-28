package com.gfy.design.eprototype;

import java.io.Serializable;

/**
 * @author gfy
 * <p>
 * 地址原型类
 */
public class Address implements Cloneable, Serializable {

    private String provinces;

    private String city;

    private String area;

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

package com.gfy.design.gadapter;

import com.gfy.design.gadapter.adaptee.ExteriorEncrypting;
import com.gfy.design.gadapter.adapter.EncryptingAdapter;
import com.gfy.design.gadapter.database.DataBaseOperation;
import com.gfy.design.gadapter.target.EncryptingUtil;

/**
 * 适配器模式定义：
 * 将一个接口转换成客户希望的另一个接口，使接口不兼容的那
 * 些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可
 * 以作为对象结构型模式。
 * <p>
 * <p>
 * <p>
 * 客户端  这是适配器模式用例。
 * <p>
 * 用例详情：现有一个加密模块，将用户机密信息（如口令、邮箱等） 加
 * 密之后再存储在数据库中，系统已经定义好了数据库操作类。为了提高开发效率，现需
 * 要重用已有的加密算法，这些算法封装在一些由第三方提供的类中，有些甚至没有源代
 * 码。试使用适配器模式设计该加密模块，在不修改现有类的基础上重用第三方加密
 * 方法
 *
 * @author gfy
 */
public class Client {

    public static void main(String[] args) {
        EncryptingUtil encryptingUtil = new EncryptingAdapter(new ExteriorEncrypting());
        DataBaseOperation dataBaseOperation = new DataBaseOperation(encryptingUtil);
        dataBaseOperation.insertDataBase("321321321", "base64");
    }


}

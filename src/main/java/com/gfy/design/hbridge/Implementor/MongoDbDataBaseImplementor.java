package com.gfy.design.hbridge.Implementor;

/**
 * @author gfy
 * <p>
 * MongoDb数据库操作实现类
 */
public class MongoDbDataBaseImplementor implements DataBaseImplementor {

    @Override
    public String selectInfo() {
        System.out.println("使用MongoDb方式读取数据库中的数据。。。。。。");
        return "MongoDb";
    }
}

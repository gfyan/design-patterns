package com.gfy.design.hbridge.Implementor;

/**
 * @author gfy
 * <p>
 * mysql数据库操作实现类
 */
public class MysqlDataBaseImplementor implements DataBaseImplementor {

    @Override
    public String selectInfo() {
        System.out.println("使用mysql方式读取数据库中的数据。。。。。。");
        return "mysql";
    }
}

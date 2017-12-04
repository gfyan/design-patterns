package com.gfy.design.hbridge.Abstraction;

/**
 * @author gfy
 * <p>
 * txt文件写入实现类
 */
public class TxtWriteFileAbstraction extends WriteFileAbstraction {

    @Override
    public void write() {
        //调用数据库工具获取数据
        String source = dataBase.selectInfo();
        System.out.println("写入数据" + source + "到txt文件中。。。。。。");
    }
}

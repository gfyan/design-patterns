package com.gfy.design.hbridge;

import com.gfy.design.hbridge.Implementor.DataBaseImplementor;
import com.gfy.design.hbridge.Implementor.MongoDbDataBaseImplementor;
import com.gfy.design.hbridge.Abstraction.TxtWriteFileAbstraction;
import com.gfy.design.hbridge.Abstraction.WriteFileAbstraction;

/**
 * 桥接模式定义：
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是
 * 一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * <p>
 * <p>
 * <p>
 * 客户端 这是桥接模式用例代码。
 * <p>
 * 用例详情：要求实现一个数据转换工具，可以将数据库中的数据转换成多种文件格式，
 * 例如txt、xml、pdf等格式，同时该工具需要支持多种不同的数据库。
 *
 * @author gfy
 */
public class Client {

    public static void main(String[] args) {
        //创建数据库连接工具
        DataBaseImplementor dataBase = new MongoDbDataBaseImplementor();
        //创建写入文件类
        WriteFileAbstraction writeFile = new TxtWriteFileAbstraction();
        writeFile.setDataBase(dataBase);

        //执行写入操作
        writeFile.write();
    }

}

package com.gfy.design.hbridge;

import com.gfy.design.hbridge.database.DataBase;
import com.gfy.design.hbridge.database.MongoDbDataBase;
import com.gfy.design.hbridge.file.TxtWriteFile;
import com.gfy.design.hbridge.file.WriteFile;

/**
 * @author gfy
 * <p>
 * 客户端 这是桥接模式用例代码，用例详情：
 * <p>
 * 要求实现一个数据转换工具，可以将数据库中的数据转换成多种文件格式，
 * 例如txt、xml、pdf等格式，同时该工具需要支持多种不同的数据库。
 */
public class Client {

    public static void main(String[] args) {
        //创建数据库连接工具
        DataBase dataBase = new MongoDbDataBase();
        //创建写入文件类
        WriteFile writeFile = new TxtWriteFile();
        writeFile.setDataBase(dataBase);

        //执行写入操作
        writeFile.write();
    }

}

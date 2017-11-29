package com.gfy.design.hbridge.file;

import com.gfy.design.hbridge.database.DataBase;

/**
 * @author gfy
 * <p>
 * txt文件写入实现类
 */
public class TxtWriteFile extends WriteFile {

    @Override
    public void write() {
        //调用数据库工具获取数据
        String source = dataBase.selectInfo();
        System.out.println("写入数据" + source + "到txt文件中。。。。。。");
    }
}

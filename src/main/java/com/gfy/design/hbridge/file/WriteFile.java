package com.gfy.design.hbridge.file;

import com.gfy.design.hbridge.database.DataBase;

/**
 * @author gfy
 * <p>
 * 写入文件抽象类
 */
public abstract class WriteFile {

    protected DataBase dataBase;


    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * 写入数据到文件中
     */
    public abstract void write();

}

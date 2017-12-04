package com.gfy.design.hbridge.Abstraction;

import com.gfy.design.hbridge.Implementor.DataBaseImplementor;

/**
 * @author gfy
 * <p>
 * 写入文件抽象类
 */
public abstract class WriteFileAbstraction {

    protected DataBaseImplementor dataBase;


    public void setDataBase(DataBaseImplementor dataBase) {
        this.dataBase = dataBase;
    }

    /**
     * 写入数据到文件中
     */
    public abstract void write();

}

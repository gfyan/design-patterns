package com.gfy.design.gadapter.database;

import com.gfy.design.gadapter.target.EncryptingUtil;

/**
 * @author gfy
 * <p>
 * 数据库操作类
 */
public class DataBaseOperation {
    EncryptingUtil encryptingUtil;

    public DataBaseOperation(EncryptingUtil encryptingAdapter) {
        this.encryptingUtil = encryptingAdapter;
    }

    public void insertDataBase(String source, String encodeMethod) {
        encryptingUtil.encode(source, encodeMethod);
        System.out.println("数据插入数据库中");
    }

}

package com.gfy.design.gadapter.database;

import com.gfy.design.gadapter.EncryptingAdapter;
import com.gfy.design.gadapter.util.EncryptingUtil;

/**
 * @author gfy
 * <p>
 * 数据库操作类
 */
public class DataBaseOperation {

    public void insertDataBase(String source) {
        EncryptingUtil encryptingUtil = new EncryptingAdapter();
        encryptingUtil.encode("12321", "md5");
        System.out.println("数据插入数据库中");
    }

}

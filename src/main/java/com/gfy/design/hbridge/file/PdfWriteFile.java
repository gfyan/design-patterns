package com.gfy.design.hbridge.file;

import com.gfy.design.hbridge.database.DataBase;

/**
 * @author gfy
 * <p>
 * pdf文件写入实现类
 */
public class PdfWriteFile extends WriteFile {


    @Override
    public void write() {
        String source = dataBase.selectInfo();
    }
}

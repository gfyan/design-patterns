package com.gfy.design.hbridge.Abstraction;

/**
 * @author gfy
 * <p>
 * pdf文件写入实现类
 */
public class PdfWriteFileAbstraction extends WriteFileAbstraction {


    @Override
    public void write() {
        String source = dataBase.selectInfo();
    }
}

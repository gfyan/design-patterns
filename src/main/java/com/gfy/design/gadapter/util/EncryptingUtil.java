package com.gfy.design.gadapter.util;

/**
 * @author gfy
 */
public abstract class EncryptingUtil {

    /**
     * 加密算法
     *
     * @param source
     * @return
     */
    public abstract String encode(String source, String flag);

    /**
     * 自己实现的加密算法
     *
     * @param source
     * @return
     */
    public String encode(String source) {
        System.out.println("默认算法加密中。。。。。。");
        return source;
    }

}

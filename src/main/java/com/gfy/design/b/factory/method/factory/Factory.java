package com.gfy.design.b.factory.method.factory;

import com.gfy.design.b.factory.method.image.WriteImage;

/**
 * @author gfy
 * <p>
 * 工厂方法基类
 */
public interface Factory {

    /**
     * 生产读取图片类方法
     *
     * @return
     */
    public WriteImage createWriteImage();

}

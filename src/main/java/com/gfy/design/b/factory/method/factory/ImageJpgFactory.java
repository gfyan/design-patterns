package com.gfy.design.b.factory.method.factory;

import com.gfy.design.b.factory.method.image.WriteImage;
import com.gfy.design.b.factory.method.image.WriteImageJpg;

/**
 * @author gfy
 * <p>
 * 创建读取jpg格式图片内容类
 */
public class ImageJpgFactory implements Factory {

    @Override
    public WriteImage createWriteImage() {
        WriteImage writeImage = null;
        System.out.println("创建读取jpg图片类中，请稍候。。。。。。");
        writeImage = new WriteImageJpg();
        System.out.println("创建完毕");
        return writeImage;
    }
}

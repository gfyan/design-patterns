package com.gfy.design.b.factory.method.factory;

import com.gfy.design.b.factory.method.image.WriteImage;
import com.gfy.design.b.factory.method.image.WriteImageGif;

/**
 * @author gfy
 * <p>
 * 生产读取gif图片类
 */
public class ImageGifFactory implements Factory {

    @Override
    public WriteImage createWriteImage() {
        WriteImage writeImage = null;
        System.out.println("创建读取gif图片类中，请稍候。。。。。。");
        writeImage = new WriteImageGif();
        System.out.println("创建完毕");
        return writeImage;
    }
}

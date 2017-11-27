package com.gfy.design.b.factory.method;

import com.gfy.design.b.factory.method.factory.Factory;
import com.gfy.design.b.factory.method.factory.ImageGifFactory;
import com.gfy.design.b.factory.method.factory.ImageJpgFactory;
import com.gfy.design.b.factory.method.image.WriteImage;

/**
 * @author gfy
 * <p>
 * 客户端
 * <p>
 * 工厂方法模式测试用例，用例详情：
 * <p>
 * <p>
 * 使用工厂方法模式设计一个程序来读取各种不同类型的图片格式，针对每一种图片格式都设
 * 计一个图片读取器，如GIF图片读取器用于读取GIF格式的图片、JPG图片读取器用于读取JPG
 * 格式的图片。
 */
public class Client {

    public static void main(String[] args) {
        WriteImage writeImage = null;
        Factory factory = null;
        String fileEds = "gif";
        if ("jpg".equals(fileEds)) {
            factory = new ImageJpgFactory();
            writeImage = factory.createWriteImage();
            writeImage.write();
        } else {
            factory = new ImageGifFactory();
            writeImage = factory.createWriteImage();
            writeImage.write();
        }
    }

}

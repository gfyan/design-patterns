package com.gfy.design.bfactory.method;

import com.gfy.design.bfactory.method.factory.Factory;
import com.gfy.design.bfactory.method.factory.ImageGifFactory;
import com.gfy.design.bfactory.method.factory.ImageJpgFactory;
import com.gfy.design.bfactory.method.image.WriteImage;

/**
 * 工厂方法模式(Factory Method Pattern)：
 * 定义一个用于创建对象的接口，让子类决定将哪一个类实例化。
 * 工厂方法模式让一个类的实例化延迟到其子类。工厂方法模式又简称为工厂模式
 * (Factory Pattern)，又可称作虚拟构造器模式(Virtual Constructor Pattern)或多态工厂模式
 * (Polymorphic Factory Pattern)。工厂方法模式是一种类创建型模式。
 * <p>
 * <p>
 * <p>
 * 客户端
 * <p>
 * 工厂方法模式测试用例。
 * <p>
 * 用例详情：使用工厂方法模式设计一个程序来读取各种不同类型的图片格式，针对每一种图片格式都设
 * 计一个图片读取器，如GIF图片读取器用于读取GIF格式的图片、JPG图片读取器用于读取JPG
 * 格式的图片。
 *
 * @author gfy
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

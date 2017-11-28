package com.gfy.design.b.factory.method.image;

/**
 * author gfy
 * <p>
 * 读取jpg图片内容类
 */
public class WriteImageJpg implements WriteImage {

    @Override
    public void write() {
        System.out.println("正在读取jpg图片内容信息，请稍候。。。。。");
    }
}

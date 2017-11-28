package com.gfy.design.b.factory.method.image;

/**
 * @author gfy
 * <p>
 * 读取gif图片具体实现类
 */
public class WriteImageGif implements WriteImage {

    @Override
    public void write() {
        System.out.println("正在读取gif图片内容信息，请稍候。。。。。");
    }
}

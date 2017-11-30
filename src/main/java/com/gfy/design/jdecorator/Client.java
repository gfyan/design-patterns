package com.gfy.design.jdecorator;

import com.gfy.design.jdecorator.component.ConcreteEncodeComponent;
import com.gfy.design.jdecorator.component.EncodeComponent;
import com.gfy.design.jdecorator.decorator.ConcreteDecoratorEncodeComponent;
import com.gfy.design.jdecorator.decorator.DecoratorEncodeComponent;

/**
 * 装饰模式：
 * 动态地给一个对象增加一些额外的职责，就增加对象功能来说，
 * 装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
 * <p>
 * <p>
 * <p>
 * 这是装饰模式的用例代码。
 * <p>
 * 用例详情：一个数据加密模块，可以对字符串进行加密。最简单的加密算法
 * 通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，还提供了更为高级
 * 的求模加密。用户先使用最简单的加密算法对字符串进行加密，如果觉得还不够可以对
 * 加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。试使用
 * 装饰模式设计该多重加密系统
 *
 * @author gfy
 */
public class Client {


    public static void main(String[] args) {
        //创建加密类
        EncodeComponent component = new ConcreteEncodeComponent();
        //创建装饰类，并且对客户端不透明的对加密类进行装饰
        DecoratorEncodeComponent decoratorEncodeComponent = new ConcreteDecoratorEncodeComponent(component);

        decoratorEncodeComponent.encode();
    }

}

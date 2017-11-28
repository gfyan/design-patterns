package com.gfy.design.f.builder;

import com.gfy.design.f.builder.controller.ModelController;
import com.gfy.design.f.builder.entity.Model;
import com.gfy.design.f.builder.modebuilder.AbstractBuilder;
import com.gfy.design.f.builder.modebuilder.CompleteBuilder;
import com.gfy.design.f.builder.modebuilder.StreamlineBuilder;

/**
 * @author gfy
 * <p>
 * 客户端，这是建造者模式测试用例，用例详情：
 * <p>
 * 如开发一个视频播放软件，为了给用户使用提供方便，该播放软件提供多
 * 种界面显示模式，如完整模式、精简模式、记忆模式、网络模式等。在不同的显示模式
 * 下主界面的组成元素有所差异，如在完整模式下将显示菜单、播放列表、主窗口、控制
 * 条等，在精简模式下只显示主窗口和控制条，而在记忆模式下将显示主窗口、控制条、
 * 收藏列表等
 */
public class Client {

    public static void main(String[] args) {
        //创建完整模式构造器
        AbstractBuilder abstractBuilder = new CompleteBuilder();
        Model model = null;
        //使用指挥者创建完整产品类
        ModelController controller = new ModelController();
        model = controller.construct(abstractBuilder);
        model.display();

        System.out.println("=============");

        //创建精简模式构造器
        abstractBuilder = new StreamlineBuilder();
        model = controller.construct(abstractBuilder);
        model.display();
    }

}

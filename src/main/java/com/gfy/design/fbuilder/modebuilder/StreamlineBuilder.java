package com.gfy.design.fbuilder.modebuilder;

/**
 * @author gfy
 * <p>
 * 精简模式构造器
 * 显示主窗口、控制
 * 条
 */
public class StreamlineBuilder extends AbstractBuilder {


    @Override
    public void buildMenu() {
        model.setMenu(false);
    }

    @Override
    public void buildPlayList() {
        model.setPlayList(false);
    }

    @Override
    public void buildMainWindow() {
        model.setMainWindow(true);
    }

    @Override
    public void buildController() {
        model.setController(true);
    }
}

package com.gfy.design.fbuilder.modebuilder;

/**
 * @author gfy
 * <p>
 * 完整模式构造器
 * 显示菜单、播放列表、主窗口、控制
 * 条
 */
public class CompleteBuilder extends AbstractBuilder {


    @Override
    public void buildMenu() {
        model.setMenu(true);
    }

    @Override
    public void buildPlayList() {
        model.setPlayList(true);
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

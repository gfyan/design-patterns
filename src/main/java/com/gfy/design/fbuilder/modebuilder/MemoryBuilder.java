package com.gfy.design.fbuilder.modebuilder;

/**
 * @author gfy
 * <p>
 * 记忆模式构造器
 * 显示主窗口、控制
 * 条
 */
public class MemoryBuilder extends AbstractBuilder {


    @Override
    public void buildMenu() {
        model.setMenu(false);
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
        model.setController(false);
    }
}

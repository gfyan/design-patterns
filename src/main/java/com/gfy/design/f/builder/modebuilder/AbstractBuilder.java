package com.gfy.design.f.builder.modebuilder;

import com.gfy.design.f.builder.entity.Model;

/**
 * @author gfy
 * <p>
 * 抽象创建者
 */
public abstract class AbstractBuilder {


    protected Model model = new Model();


    public Model getModel() {
        return model;
    }

    /**
     * 主菜单显示控制
     */
    public abstract void buildMenu();

    /**
     * 播放列表显示控制
     */
    public abstract void buildPlayList();

    /**
     * 播放主界面显示控制
     */
    public abstract void buildMainWindow();

    /**
     * 控制条显示控制
     */
    public abstract void buildController();

}

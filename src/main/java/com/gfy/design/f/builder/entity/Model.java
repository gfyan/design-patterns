package com.gfy.design.f.builder.entity;

/**
 * @author gfy
 * <p>
 * 模式产品类
 */
public class Model {

    private Boolean menu;

    private Boolean playList;

    private Boolean mainWindow;

    private Boolean controller;

    public Boolean getMenu() {
        return menu;
    }

    public void setMenu(Boolean menu) {
        this.menu = menu;
    }

    public Boolean getPlayList() {
        return playList;
    }

    public void setPlayList(Boolean playList) {
        this.playList = playList;
    }

    public Boolean getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(Boolean mainWindow) {
        this.mainWindow = mainWindow;
    }

    public Boolean getController() {
        return controller;
    }

    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public void display() {
        if (menu) {
            System.out.println("显示主菜单");
        }
        if (playList) {
            System.out.println("显示播放列表");
        }
        if (mainWindow) {
            System.out.println("显示主界面");
        }
        if (controller) {
            System.out.println("显示控制条");
        }
    }
}

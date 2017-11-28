package com.gfy.design.fbuilder.controller;

import com.gfy.design.fbuilder.entity.Model;
import com.gfy.design.fbuilder.modebuilder.AbstractBuilder;

/**
 * @author gfy
 * <p>
 * 指挥者 指挥构造器生成完整的产品类
 */
public class ModelController {

    public Model construct(AbstractBuilder abstractBuilder) {
        abstractBuilder.buildMenu();
        abstractBuilder.buildPlayList();
        abstractBuilder.buildMainWindow();
        abstractBuilder.buildController();
        return abstractBuilder.getModel();
    }
}

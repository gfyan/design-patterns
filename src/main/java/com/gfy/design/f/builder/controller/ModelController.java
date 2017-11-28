package com.gfy.design.f.builder.controller;

import com.gfy.design.f.builder.entity.Model;
import com.gfy.design.f.builder.modebuilder.AbstractBuilder;

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

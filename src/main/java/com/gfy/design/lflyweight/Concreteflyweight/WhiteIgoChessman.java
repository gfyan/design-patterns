package com.gfy.design.lflyweight.Concreteflyweight;

import com.gfy.design.lflyweight.flyweight.IgoChessman;

/**
 * @author gfy
 * <p>
 * 具体享元类
 */
public class WhiteIgoChessman extends IgoChessman {

    @Override
    public String getColor() {
        return "白色";
    }
}

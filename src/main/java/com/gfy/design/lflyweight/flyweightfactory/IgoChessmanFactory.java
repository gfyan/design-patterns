package com.gfy.design.lflyweight.flyweightfactory;

import com.gfy.design.lflyweight.Concreteflyweight.BlackIgoChessman;
import com.gfy.design.lflyweight.Concreteflyweight.WhiteIgoChessman;
import com.gfy.design.lflyweight.flyweight.IgoChessman;

import java.util.HashMap;

/**
 * @author gfy
 * <p>
 * 享元工厂---生成享元实例
 */
public class IgoChessmanFactory {

    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static HashMap<String, IgoChessman> hashMap;

    private IgoChessmanFactory() {
        hashMap = new HashMap<>();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        hashMap.put("b", black);
        hashMap.put("w", white);
    }

    /**
     * 返回享元工厂实例
     *
     * @return
     */
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 获取实例
     *
     * @param color
     * @return
     */
    public IgoChessman getIgoChessman(String color) {
        return hashMap.get(color);
    }

}

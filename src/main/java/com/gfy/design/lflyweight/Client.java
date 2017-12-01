package com.gfy.design.lflyweight;

import com.gfy.design.lflyweight.flyweight.IgoChessman;
import com.gfy.design.lflyweight.flyweightfactory.IgoChessmanFactory;

/**
 * 享元模式：运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，
 * 而这些对象都很相似，状态变化很小，可以实现对象的多次复用。由于
 * 享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种
 * 对象结构型模式。
 * <p>
 * <p>
 * <p>
 * 这是享元模式用例代码
 * <p>
 * 用例详情：
 * <p>
 * 使用享元模式设计围棋中的棋子
 *
 * @author gfy
 */
public class Client {


    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory = IgoChessmanFactory.getInstance();
        IgoChessman black1 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman black2 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman black3 = igoChessmanFactory.getIgoChessman("b");
        IgoChessman white = igoChessmanFactory.getIgoChessman("w");

        black1.display();
        black2.display();
        black3.display();
        white.display();
    }


}

package com.gfy.design.kfacade.facade;

import com.gfy.design.kfacade.subSystem.SubSystemA;
import com.gfy.design.kfacade.subSystem.SubSystemB;

/**
 * @author gfy
 * <p>
 * 抽象外观者
 */
public class ConcreteFacade extends AbstractFacade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    @Override
    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
    }
}

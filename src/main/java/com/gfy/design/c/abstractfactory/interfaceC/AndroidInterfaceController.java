package com.gfy.design.c.abstractfactory.interfaceC;

import com.gfy.design.c.abstractfactory.interfaceC.InterfaceController;

/**
 * @author gfy
 */
public class AndroidInterfaceController implements InterfaceController {

    @Override
    public void interfaceA() {
        System.out.println("这是安卓系统操作界面");
    }
}

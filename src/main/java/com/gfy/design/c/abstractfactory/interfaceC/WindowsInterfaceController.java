package com.gfy.design.c.abstractfactory.interfaceC;

import com.gfy.design.c.abstractfactory.interfaceC.InterfaceController;

/**
 * @author gfy
 */
public class WindowsInterfaceController implements InterfaceController {

    @Override
    public void interfaceA() {
        System.out.println("这是windows系统操作界面");
    }
}

package com.gfy.design.mproxy.realsubject;

import com.gfy.design.mproxy.subject.IUser;


/**
 * @author gfy
 * <p>
 * 真实目标对象
 */
public class User implements IUser {

    @Override
    public void whetherTheSingle() {
        System.out.println("我不是单身，你已经没戏了！！");
    }
}

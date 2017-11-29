package com.gfy.design.icomposite;

/**
 * @author gfy
 * <p>
 * 普通员工类
 */
public class StaffMemberCompany extends CompanyCompositeAdapter {

    private String name;

    public StaffMemberCompany(String name) {
        this.name = name;
    }

    @Override
    public void seed() {
        System.out.println("对员工" + name + "进行邮件发送");
    }
}

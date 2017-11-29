package com.gfy.design.icomposite;

/**
 * @author gfy
 * <p>
 * 客户端 这是组合模式测试用例，用例详情：
 * <p>
 * 要求对一个公司进行邮件发送功能，发送对象有可能是部门（人力部、技术部、管理部），也有
 * 可能是分公司，也有可能是单个对象
 */
public class Client {


    public static void main(String[] args) {
        //创建总部
        CompanyComposite headquarter = new DepartmentCompanyComposite("总部");

        CompanyComposite technology = new DepartmentCompanyComposite("技术部门");

        //创建技术员工
        StaffMemberCompany staffMemberCompany = new StaffMemberCompany("张三---java");
        StaffMemberCompany staffMemberCompany2 = new StaffMemberCompany("李四---java");
        StaffMemberCompany staffMemberCompany3 = new StaffMemberCompany("王五---java");
        //添加至技术部门
        technology.add(staffMemberCompany);
        technology.add(staffMemberCompany2);
        technology.add(staffMemberCompany3);

        headquarter.add(technology);
        headquarter.seed();
    }


}

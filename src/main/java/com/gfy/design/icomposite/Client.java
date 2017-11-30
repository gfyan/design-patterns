package com.gfy.design.icomposite;

/**
 * 组合模式定义：
 * 组合多个对象形成树形结构以表示具有“整体—部分”关系的层
 * 次结构。组合模式对单个对象（即叶子对象） 和组合对象（即容器对象） 的使用具有一致
 * 性，组合模式又可以称为“整体—部分”(Part-Whole)模式，它是一种对象结构型模式。
 * <p>
 * <p>
 * <p>
 * 客户端 这是组合模式测试用例。
 * <p>
 * 用例详情：要求对一个公司进行邮件发送功能，发送对象有可能是部门（人力部、技术部、管理部），也有
 * 可能是分公司，也有可能是单个对象
 *
 * @author gfy
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

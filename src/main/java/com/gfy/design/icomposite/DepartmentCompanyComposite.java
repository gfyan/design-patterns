package com.gfy.design.icomposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gfy
 * <p>
 * 公司技术部门类
 */
public class DepartmentCompanyComposite extends CompanyComposite {

    private List<CompanyComposite> companyComposites = new ArrayList<>();

    private String name;


    public DepartmentCompanyComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(CompanyComposite companyComposite) {
        companyComposites.add(companyComposite);
    }

    @Override
    public void remove(CompanyComposite companyComposite) {

    }

    @Override
    public CompanyComposite getChild(int i) {
        return companyComposites.get(i);
    }

    @Override
    public void seed() {
        System.out.println("对" + name + "进行短信发送。。。。");
        for (int i = 0; i < companyComposites.size(); i++) {
            getChild(i).seed();
        }
    }
}

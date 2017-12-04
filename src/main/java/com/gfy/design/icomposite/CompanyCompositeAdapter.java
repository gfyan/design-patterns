package com.gfy.design.icomposite;

import com.gfy.design.icomposite.component.CompanyComposite;

/**
 * @author gfy
 * <p>
 * 使用缺省适配器，方便叶子构件不用实现add以及remove空方法
 */
public class CompanyCompositeAdapter extends CompanyComposite {

    @Override
    public void add(CompanyComposite companyComposite) {

    }

    @Override
    public void remove(CompanyComposite companyComposite) {

    }

    @Override
    public CompanyComposite getChild(int i) {
        return null;
    }

    @Override
    public void seed() {

    }
}

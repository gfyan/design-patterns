package com.gfy.design.icomposite;

/**
 * @author gfy
 * <p>
 * 公司抽象类
 */
public abstract class CompanyComposite {

    /**
     * 添加公司构件
     *
     * @param companyComposite
     */
    public abstract void add(CompanyComposite companyComposite);

    /**
     * 移除公司构件
     *
     * @param companyComposite
     */
    public abstract void remove(CompanyComposite companyComposite);

    /**
     * 查询子公司构件方法
     *
     * @param i
     */
    public abstract CompanyComposite getChild(int i);

    /**
     * 发送邮件方法
     */
    public abstract void seed();

}

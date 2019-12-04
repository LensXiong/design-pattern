package com.wwxiong.patterns.composite;

/**
 * Component 抽象类
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;

    /**
     * 构造方法
     *
     * @param name
     * @param des
     */
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    // 抽象方法，具体由子类实现
    protected abstract void print();
}

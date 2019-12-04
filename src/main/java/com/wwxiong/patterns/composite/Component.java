package com.wwxiong.patterns.composite;

/**
 * Component ������
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;

    /**
     * ���췽��
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

    // ���󷽷�������������ʵ��
    protected abstract void print();
}

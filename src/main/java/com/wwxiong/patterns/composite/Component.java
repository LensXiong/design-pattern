package com.wwxiong.patterns.composite;

/**
 * 组合中对象声明接口
 * 在适当情况下，实现所有类共有的接口默认行为,用于访问和管理 Component 子部件, Component 可以是抽象类或者接口。
 */
public abstract class Component {

    private String name;
    private String des;

    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * 构造器
     *
     * @param name
     * @param des
     */
    public Component(String name, String des) {
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

    // print抽象方法, 需要子类实现
    protected abstract void print();


}

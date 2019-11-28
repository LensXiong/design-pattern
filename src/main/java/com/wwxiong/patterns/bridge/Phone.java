package com.wwxiong.patterns.bridge;

public abstract class Phone {

    // 将品牌聚合到手机抽象类中
    private Brand brand;

    // 构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }

}
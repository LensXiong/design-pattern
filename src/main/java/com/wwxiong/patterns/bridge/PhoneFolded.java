package com.wwxiong.patterns.bridge;

/**
 * 子类 PhoneFolded 需要继承（泛化）抽象类 Phone
 */
public class PhoneFolded extends Phone {

    // 构造器
    public PhoneFolded(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机关机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}

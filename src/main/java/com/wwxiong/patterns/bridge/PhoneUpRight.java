package com.wwxiong.patterns.bridge;

/**
 * 子类 PhoneUpRight 需要继承（泛化）抽象类 Phone
 */
public class PhoneUpRight extends Phone {

    // 构造器
    public PhoneUpRight(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直立样式手机开机 ");
    }

    public void close() {
        super.close();
        System.out.println("直立样式手机关机 ");
    }

    public void call() {
        super.call();
        System.out.println("直立样式手机打电话 ");
    }
}

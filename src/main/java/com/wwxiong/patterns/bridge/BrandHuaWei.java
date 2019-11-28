package com.wwxiong.patterns.bridge;

/**
 * 子实现类需实现品牌接口中的方法
 */
public class BrandHuaWei implements Brand {
    @Override
    public void open() {
        System.out.print("华为");
    }

    @Override
    public void close() {
        System.out.print("华为");
    }

    @Override
    public void call() {
        System.out.print("华为");
    }
}

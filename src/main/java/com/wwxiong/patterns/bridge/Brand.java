package com.wwxiong.patterns.bridge;

/**
 * 定义品牌接口
 *
 * 具体手机品牌类需要实现该接口中的方法
 *
 */
public interface Brand {
    void open();

    void close();

    void call();
}

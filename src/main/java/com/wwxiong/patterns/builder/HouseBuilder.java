package com.wwxiong.patterns.builder;


/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // 建造流程的抽象方法，具体实现交给子类来完成。
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // 返回产品
    public House buildHouse() {
        return house;
    }

}

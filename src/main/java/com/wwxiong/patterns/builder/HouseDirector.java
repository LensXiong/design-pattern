package com.wwxiong.patterns.builder;


/**
 * 指挥者，指挥建造流程，返回对应的产品
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 方式一：通过构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 方式二：通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过指挥者，来处理建造房子的流程
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }


}

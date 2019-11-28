package com.wwxiong.patterns.builder;

public class Client {
    public static void main(String[] args) {

        /**
         * 1、需要建造一个普通房子
         * 2、将普通房子交给指挥者
         * 3、完成盖房子，返回产品(普通房子)
         */
        BuildingCommon buildingCommon = new BuildingCommon();
        HouseDirector houseDirector = new HouseDirector(buildingCommon);
        houseDirector.constructHouse();

        System.out.println("----------------");

        /**
         * 1、需要建造一个高楼
         * 2、将高楼交给指挥者
         * 3、完成盖房子，返回产品(高楼)
         */
        BuildingHigh buildingHigh = new BuildingHigh();
        houseDirector.setHouseBuilder(buildingHigh);
        houseDirector.constructHouse();

    }
}

package com.wwxiong.patterns.builder;

public class Client {
    public static void main(String[] args) {

        /**
         * 1����Ҫ����һ����ͨ����
         * 2������ͨ���ӽ���ָ����
         * 3����ɸǷ��ӣ����ز�Ʒ(��ͨ����)
         */
        BuildingCommon buildingCommon = new BuildingCommon();
        HouseDirector houseDirector = new HouseDirector(buildingCommon);
        houseDirector.constructHouse();

        System.out.println("----------------");

        /**
         * 1����Ҫ����һ����¥
         * 2������¥����ָ����
         * 3����ɸǷ��ӣ����ز�Ʒ(��¥)
         */
        BuildingHigh buildingHigh = new BuildingHigh();
        houseDirector.setHouseBuilder(buildingHigh);
        houseDirector.constructHouse();

    }
}

package com.wwxiong.patterns.bridge;

public class Client {

    public static void main(String[] args) {

        // 聚合品牌接口和手机抽象类
        Phone phone1 = new PhoneFolded(new BrandXiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("================");

        Phone phone2 = new PhoneFolded(new BrandHuaWei());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("================");

        PhoneUpRight phone3 = new PhoneUpRight(new BrandXiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("================");

        PhoneUpRight phone4 = new PhoneUpRight(new BrandHuaWei());
        phone4.open();
        phone4.call();
        phone4.close();
    }

}

package com.wwxiong.patterns.prototype.lightclone;


public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式--浅克隆--完成sheep对象的创建");
        ConcreteSheep concreteSheep = new ConcreteSheep("tom", 1, "白色");
        concreteSheep.friend = new ConcreteSheep("jack", 2, "黑色");

        ConcreteSheep concreteSheep2 = (ConcreteSheep) concreteSheep.clone(); // 克隆2
        ConcreteSheep concreteSheep3 = (ConcreteSheep) concreteSheep.clone(); // 克隆3

        System.out.println("concreteSheep2 =" + concreteSheep2 + "concreteSheep2.friend=" + concreteSheep2.friend.hashCode());
        System.out.println("concreteSheep3 =" + concreteSheep3 + "concreteSheep3.friend=" + concreteSheep3.friend.hashCode());


        System.out.println("原型模式--浅克隆--完成dog对象的创建");
        ConcreteDog concreteDog = new ConcreteDog("小狗1", 1, "白色");
        ConcreteDog.friend1 = new ConcreteDog("小狗1的朋友", 2, "黑色");

        ConcreteDog concreteDog2 = (ConcreteDog) concreteDog.clone(); // 克隆2
        ConcreteDog concreteDog3 = (ConcreteDog) concreteDog.clone(); // 克隆3

        System.out.println("concreteDog2 =" + concreteDog2 + "concreteDog2.friend=" + concreteDog2.friend1.hashCode());
        System.out.println("concreteDog3 =" + concreteDog3 + "concreteDog3.friend=" + concreteDog3.friend1.hashCode());
    }

}

package com.wwxiong.patterns.prototype.lightclone;


public class Client {

    public static void main(String[] args) {
        System.out.println("ԭ��ģʽ--ǳ��¡--���sheep����Ĵ���");
        ConcreteSheep concreteSheep = new ConcreteSheep("tom", 1, "��ɫ");
        concreteSheep.friend = new ConcreteSheep("jack", 2, "��ɫ");

        ConcreteSheep concreteSheep2 = (ConcreteSheep) concreteSheep.clone(); // ��¡2
        ConcreteSheep concreteSheep3 = (ConcreteSheep) concreteSheep.clone(); // ��¡3

        System.out.println("concreteSheep2 =" + concreteSheep2 + "concreteSheep2.friend=" + concreteSheep2.friend.hashCode());
        System.out.println("concreteSheep3 =" + concreteSheep3 + "concreteSheep3.friend=" + concreteSheep3.friend.hashCode());


        System.out.println("ԭ��ģʽ--ǳ��¡--���dog����Ĵ���");
        ConcreteDog concreteDog = new ConcreteDog("С��1", 1, "��ɫ");
        ConcreteDog.friend1 = new ConcreteDog("С��1������", 2, "��ɫ");

        ConcreteDog concreteDog2 = (ConcreteDog) concreteDog.clone(); // ��¡2
        ConcreteDog concreteDog3 = (ConcreteDog) concreteDog.clone(); // ��¡3

        System.out.println("concreteDog2 =" + concreteDog2 + "concreteDog2.friend=" + concreteDog2.friend1.hashCode());
        System.out.println("concreteDog3 =" + concreteDog3 + "concreteDog3.friend=" + concreteDog3.friend1.hashCode());
    }

}

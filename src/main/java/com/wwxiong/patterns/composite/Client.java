package com.wwxiong.patterns.composite;

public class Client {

    public static void main(String[] args) {
        // 创建学校
        Component university = new University("清华大学", " 中国顶级大学 ");

        // 创建学院
        Component computerCollege = new College("计算机学院", " 计算机学院 ");
        Component infoEngineercollege = new College("信息工程学院", " 信息工程学院 ");

        // 给学院添加专业
        computerCollege.add(new Department("软件工程", " 软件工程不错 "));
        computerCollege.add(new Department("网络工程", " 网络工程不错 "));
        computerCollege.add(new Department("计算机科学与技术", " 计算机科学与技术是老牌的专业 "));

        // 给学院添加专业
        infoEngineercollege.add(new Department("通信工程", " 通信专业 "));
        infoEngineercollege.add(new Department("信息工程", " 信息工程专业 "));

        // 给学校添加学院
        university.add(computerCollege);
        university.add(infoEngineercollege);

        // 输出学校 - 学院 - 专业
        university.print();
    }

}

package com.wwxiong.patterns.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void operation1() {
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.operation1();
    }
}

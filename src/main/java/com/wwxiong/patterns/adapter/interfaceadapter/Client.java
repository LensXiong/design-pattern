package com.wwxiong.patterns.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            //ֻ��Ҫȥ�������� ��Ҫʹ�� �ӿڷ���
            @Override
            public void operation1() {
                System.out.println("ʹ����m1�ķ���");
            }
        };

        absAdapter.operation1();
    }
}

package com.wwxiong.patterns.composite;

public class Client {

    public static void main(String[] args) {
        // ����ѧУ
        Component university = new University("�廪��ѧ", " �й�������ѧ ");

        // ����ѧԺ
        Component computerCollege = new College("�����ѧԺ", " �����ѧԺ ");
        Component infoEngineercollege = new College("��Ϣ����ѧԺ", " ��Ϣ����ѧԺ ");

        // ��ѧԺ���רҵ
        computerCollege.add(new Department("�������", " ������̲��� "));
        computerCollege.add(new Department("���繤��", " ���繤�̲��� "));
        computerCollege.add(new Department("�������ѧ�뼼��", " �������ѧ�뼼�������Ƶ�רҵ "));

        // ��ѧԺ���רҵ
        infoEngineercollege.add(new Department("ͨ�Ź���", " ͨ��רҵ "));
        infoEngineercollege.add(new Department("��Ϣ����", " ��Ϣ����רҵ "));

        // ��ѧУ���ѧԺ
        university.add(computerCollege);
        university.add(infoEngineercollege);

        // ���ѧУ - ѧԺ - רҵ
        university.print();
    }

}

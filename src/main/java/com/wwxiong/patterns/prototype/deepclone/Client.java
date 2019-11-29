package com.wwxiong.patterns.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		DeepProtoType p = new DeepProtoType();
		p.name = "�ν�";
		p.deepCloneableTarget = new DeepCloneableTarget("��ţ", "Сţ");
		
		// ��ʽ1 ������
		
		// DeepProtoType p2 = (DeepProtoType) p.clone();
		// System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		// System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	
		//��ʽ2 ������
		DeepProtoType p2 = (DeepProtoType) p.deepClone();

		System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name=" + p.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());
	}

}

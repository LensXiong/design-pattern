package com.wwxiong.patterns.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable{
	
	public String name; //String ����
	public DeepCloneableTarget deepCloneableTarget;// ��������
	public DeepProtoType() {
		super();
	}
	
	
	// ��� - ��ʽ 1 ʹ��clone ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//������ɶԻ�����������(����)��String�Ŀ�¡
		deep = super.clone(); 
		//���������͵����ԣ����е�������
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		// TODO Auto-generated method stub
		return deepProtoType;
	}
	
	// ��� - ��ʽ2 ͨ����������л�ʵ�� (�Ƽ�)
	
	public Object deepClone() {
		
		//����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this); //��ǰ��������Զ������ķ�ʽ���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
}

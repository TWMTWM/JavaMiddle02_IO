package cn.gtmap.object_stream;

import java.io.Serializable;

/**
 * ����һ��Hero��������������Ϊgaren�� 
 * 	�Ѹö������л���һ���ļ�garen.lol��
 * 	Ȼ����ͨ�����л��Ѹ��ļ�ת��Ϊһ��Hero����
 * 	ע����һ���������л���һ��ǰ���ǣ����������࣬����ʵ����Serializable�ӿ�
 *
 */
public class Hero implements Serializable{
	/**
	 * ��ʾ����൱ǰ�İ汾��������˱仯����������������ԣ���Ӧ���޸�����汾��
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public float hp;
	
	public Hero(String name) {
		super();
		this.name = name;
	}
	
	public Hero(){
		
	}
	
}

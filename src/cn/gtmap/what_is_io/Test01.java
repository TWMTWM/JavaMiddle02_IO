package cn.gtmap.what_is_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �ļ�������
 * ���´��룬�ͽ�����һ���ļ���������������������������ݴ�Ӳ�̵��ļ�����ȡ��JVM(�ڴ�)��
 * 	Ŀǰ����ֻ�ǽ�����������û�п�ʼ��ȡ�������Ķ�ȡ���¸��½ڽ��⡣
 *	
 */
public class Test01 {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		try {
			// ���������ļ���������
			FileInputStream fis = new FileInputStream(f);
			// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

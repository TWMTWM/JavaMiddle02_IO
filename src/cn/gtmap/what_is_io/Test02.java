package cn.gtmap.what_is_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 * �����
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		try {
			// ���������ļ��������
			FileOutputStream fos = new FileOutputStream(f);
			// ͨ�������������Ϳ��԰����ݴ��ڴ棬�����Ӳ�̵��ļ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package cn.gtmap.byte_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		// ׼���ļ�lol2.txt���е������ǿյ�
		File f = new File("d:/lol2.txt");
		// ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
		byte data[] = {88,89};
		try {
			// ���������ļ��������
			FileOutputStream fos = new FileOutputStream(f);
			// ������д�뵽�����
			fos.write(data);
			// �ر������
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}

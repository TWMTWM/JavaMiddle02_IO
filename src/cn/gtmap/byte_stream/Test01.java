package cn.gtmap.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ���ֽ�������ʽ��ȡ�ļ�����
 * 	InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
 * 	FileInputStream ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ	
 */
public class Test01 {
	public static void main(String[] args) {
		//׼���ļ�lol.txt���е�������AB����Ӧ��ASCII�ֱ���65 66
		File f = new File("d:/lol.txt");
		try {
			//���������ļ���������
			FileInputStream fis = new FileInputStream(f);
			//�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
			byte[] all = new byte[(int) f.length()];
			//���ֽ�������ʽ��ȡ�ļ���������
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);//��ӡ������65 66
			}
			//ÿ��ʹ����������Ӧ�ý��йر�
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

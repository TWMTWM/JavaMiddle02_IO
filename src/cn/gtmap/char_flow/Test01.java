package cn.gtmap.char_flow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ���ַ�����ȡ�ļ�
 * FileReader ��Reader���࣬
 * 	��FileReader Ϊ�������ļ���ȡ
 */
public class Test01 {
	public static void main(String[] args) {
		// ׼���ļ�lol.txt���е�������AB
		File f = new File("d:/lol.txt");
		// ���������ļ���Reader
		try(FileReader fr = new FileReader(f);) {
			// �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
			char[] all = new char[(int) f.length()];
			// ���ַ�������ʽ��ȡ�ļ���������
			fr.read(all);
			for (char c : all) {
				// ��ӡ������A B
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

package cn.gtmap.char_flow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ַ������뵽�ļ�
 *	FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
 */
public class Test02 {
	public static void main(String[] args) {
		//׼��lol2.txt
		File f = new File("d:/lol2.txt");
		// ���������ļ���Writer
		try(FileWriter fr = new FileWriter(f)) {
			String data = "abcdefg1234567890";
			char[] cs = data.toCharArray();
			fr.write(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package cn.gtmap.metgod_close_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * ��try�йر�
 *	��try����������ر��ļ�����������ǰ���ʾ���ж���ʹ�����ַ�ʽ����������һ���׶ˣ�
 *	����ļ������ڣ����߶�ȡ��ʱ�����������׳��쳣����ô�Ͳ���ִ����һ�йر����Ĵ��룬
 *	���ھ޴����Դռ�������� ���Ƽ�ʹ��
 */
public class Test01_in_Try {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			//��try��ر�
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

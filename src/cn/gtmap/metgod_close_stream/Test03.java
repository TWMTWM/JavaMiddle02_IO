package cn.gtmap.metgod_close_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ʹ��try()
 * 	����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
 * 	���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���
 * 	���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ���������try()�н���ʵ������ ������try, catch, finally������ʱ���Զ��رգ����������Դ��
 *
 */
public class Test03 {
	public static void main(String[] args) {
		File f =new File("d:/lol.txt");
		//����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
		try (FileInputStream fis = new FileInputStream(f)){
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
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

package cn.gtmap.metgod_close_stream;

import java.io.File;
/**
 * ��finally�йر�
 *	���Ǳ�׼�Ĺر����ķ�ʽ
 *		1. ���Ȱ���������������try�����棬���������try���棬���������޷��ִ�finally.
 *		2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��
 *		3. �رյ�ʱ����Ҫ��һ�ν���try catch����
 *		���Ǳ�׼���Ͻ��Ĺر����ķ�ʽ�����ǿ���ȥ�ܷ���������д����Ҫ�Ļ��߲��Դ����ʱ�򣬶�����������������try�ķ�ʽ����Ϊ���鷳~
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test02 {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//��finally��ر���
			if(null != fis)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
}

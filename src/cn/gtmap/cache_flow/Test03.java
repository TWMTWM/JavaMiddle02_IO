package cn.gtmap.cache_flow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * flush
 * 	�е�ʱ����Ҫ����������д�뵽Ӳ�̣������ǵȻ������˲�д��ȥ�� 
 * 	��ʱ�����Ҫ�õ�flushistrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//���ļ�lol2.txt��д���������
		File f = new File("d:/lol3.txt");
        //�����ļ��ַ���
        //���������뽨����һ�����ڵ����Ļ�����
		try(
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
		) 
		{
			pw.println("garen kill teemo");
			//ǿ�ưѻ����е�����д��Ӳ�̣����ۻ����Ƿ�����
				pw.flush();
			pw.println("teemo revive after 1 minutes");
				pw.flush();
			pw.println("teemo try to garen, but killed again");
				pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

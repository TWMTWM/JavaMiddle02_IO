package cn.gtmap.cache_flow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ�û�������ȡ����
 * �����ַ������� BufferedReader ����һ�ζ�ȡһ������
 */
public class Test01 {
	public static void main(String[] args) {
        // ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
		File f = new File("d:/lol.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
		try(
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
			) 
		{
			while(true){
				//һ�ζ�һ��
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
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

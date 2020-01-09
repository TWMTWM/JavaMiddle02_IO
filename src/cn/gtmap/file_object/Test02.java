package cn.gtmap.file_object;

import java.io.File;
import java.util.Date;

/**
 * �ļ����÷���1
 * 
 * ע��1�� ��Ҫ��D:\LOLFolderȷʵ����һ��LOL.exe,�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ
 * ע��2�� renameTo�������ڶ������ļ����ƽ����޸ģ����ǲ������޸�File�����name���ԡ�
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File f = new File("d:/LOLFolder/LOL.exe");
		System.out.println("��ǰ�ļ��ǣ�" + f);
		
		//�ļ��Ƿ����
		System.out.println("�ж��Ƿ����:" + f.exists());
		
		//�Ƿ����ļ���
		System.out.println("�ж��Ƿ����ļ��У�" + f.isDirectory());
		
		//�Ƿ����ļ������ļ��У�
		System.out.println("�ж��Ƿ����ļ������ļ��У���" + f.isFile());
		
		//�ļ�����
		System.out.println("��ȡ�ļ����ȣ�" + f.length());
		
		//�ļ�����޸�ʱ��
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("��ȡ�ļ�����޸�ʱ�䣺" + d);
		//�����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
		f.setLastModified(0);
		
		//�ļ�������
		File f2 = new File("d:/LOLFolder/DOTA.exe");
		f.renameTo(f2);
		System.out.println("��LOL.exe��������DOTA.exe");
		
		System.out.println("ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ");
	}
}
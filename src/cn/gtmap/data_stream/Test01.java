package cn.gtmap.data_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ֱ�ӽ����ַ����Ķ�д
 *	ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
 *		�籾����ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ�����
 *	 	Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�
 *	ע�� Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ�
 *		��������EOFException����ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�
 *		ֻ��DataInputStream ���ܳɹ��Ķ�ȡ��
 */
public class Test01 {
	
	public static void main(String[] args) {
		write();
		read();
	}
	
	/**
	 * ���룬���ı�����
	 */
	private static void read(){
		File f = new File("d:/lol4.txt");
		try(
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
			)
		{
			boolean b = dis.readBoolean();
			int i = dis.readInt();
			String str = dis.readUTF();
			
			System.out.println("��ȡ������ֵ:"+b);
			System.out.println("��ȡ������:"+i);
			System.out.println("��ȡ���ַ���:"+str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	/**
	 * ��������ı����
	 */
	private static void write(){
		File f = new File("d:/lol4.txt");
		
		try(
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
			) 
		{
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeUTF("123 this is gareen");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}

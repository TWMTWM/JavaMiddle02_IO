package cn.gtmap.object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л�һ������
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
        //����һ��Hero garen
        //Ҫ��Hero����ֱ�ӱ������ļ��ϣ������Hero��ʵ��Serializable�ӿ�
		Hero h = new Hero();
		h.name = "gareen";
		h.hp = 616.45f;
		//׼��һ���ļ����ڱ���ö���
		File f = new File("d:/garen.txt");
		try(
				//�������������
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//��������������
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
			)
		{
			oos.writeObject(h);
			Hero h2 =  (Hero) ois.readObject();
			System.out.println(h2.name);
			System.out.println(h2.hp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

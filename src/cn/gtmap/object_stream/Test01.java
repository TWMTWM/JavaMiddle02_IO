package cn.gtmap.object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化一个对象
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
		Hero h = new Hero();
		h.name = "gareen";
		h.hp = 616.45f;
		//准备一个文件用于保存该对象
		File f = new File("d:/garen.txt");
		try(
				//创建对象输出流
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//创建对象输入流
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

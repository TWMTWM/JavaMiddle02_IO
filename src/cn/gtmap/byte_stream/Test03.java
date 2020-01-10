package cn.gtmap.byte_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 练习：写入数据到文件
 *	以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
 *	但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
 *	那么怎么自动创建xyz目录？
 *	如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
 */
public class Test03 {
	public static void main(String[] args) {
		File f = new File("d:/xyz/abc/def/lol2.txt");
		//因为默认情况下，文件系统中不存在 d:\xyz\abc\def，所以输出会失败
		
		//首先获取文件所在的目录
		File dir = f.getParentFile();//d:\xyz\abc\def
		
		//如果该目录不存在，则创建该目录
		if(!dir.exists()){//!true=false
			//dir.mkdir(); //使用mkdir会抛出异常，因为该目录的父目录也不存在
			dir.mkdirs();
		}
		
		byte data[] ={88,89};
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(data);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package cn.gtmap.what_is_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 * 输出流
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		try {
			// 创建基于文件的输出流
			FileOutputStream fos = new FileOutputStream(f);
			// 通过这个输出流，就可以把数据从内存，输出到硬盘的文件上
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

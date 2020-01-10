package cn.gtmap.char_flow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流把字符串读入到文件
 *	FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
 */
public class Test02 {
	public static void main(String[] args) {
		//准备lol2.txt
		File f = new File("d:/lol2.txt");
		// 创建基于文件的Writer
		try(FileWriter fr = new FileWriter(f)) {
			String data = "abcdefg1234567890";
			char[] cs = data.toCharArray();
			fr.write(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

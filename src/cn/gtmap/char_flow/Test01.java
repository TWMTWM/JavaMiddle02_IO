package cn.gtmap.char_flow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用字符流读取文件
 * FileReader 是Reader子类，
 * 	以FileReader 为例进行文件读取
 */
public class Test01 {
	public static void main(String[] args) {
		// 准备文件lol.txt其中的内容是AB
		File f = new File("d:/lol.txt");
		// 创建基于文件的Reader
		try(FileReader fr = new FileReader(f);) {
			// 创建字符数组，其长度就是文件的长度
			char[] all = new char[(int) f.length()];
			// 以字符流的形式读取文件所有内容
			fr.read(all);
			for (char c : all) {
				// 打印出来是A B
				System.out.println(c);
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

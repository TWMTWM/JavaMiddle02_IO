package cn.gtmap.what_is_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 文件输入流
 * 如下代码，就建立了一个文件输入流，这个流可以用来把数据从硬盘的文件，读取到JVM(内存)。
 * 	目前代码只是建立了流，还没有开始读取，真正的读取在下个章节讲解。
 *	
 */
public class Test01 {
	public static void main(String[] args) {
		File f = new File("d:/lol.txt");
		try {
			// 创建基于文件的输入流
			FileInputStream fis = new FileInputStream(f);
			// 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

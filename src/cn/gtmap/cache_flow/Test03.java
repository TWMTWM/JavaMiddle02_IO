package cn.gtmap.cache_flow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * flush
 * 	有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 
 * 	这时候就需要用到flushistrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//向文件lol2.txt中写入三行语句
		File f = new File("d:/lol3.txt");
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
		try(
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
		) 
		{
			pw.println("garen kill teemo");
			//强制把缓存中的数据写入硬盘，无论缓存是否已满
				pw.flush();
			pw.println("teemo revive after 1 minutes");
				pw.flush();
			pw.println("teemo try to garen, but killed again");
				pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

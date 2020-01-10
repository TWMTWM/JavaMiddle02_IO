package cn.gtmap.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��ϰ���ϲ��ļ�
 * 	��������ֳ������ļ����ϲ���һ��ԭ�ļ���
 * 	���Ƿ����������У���֤�ϲ��Ƿ���ȷ
 * �����ļ���ͬ(�Ȱ��������ݶ�ȡ���ڴ���)���ϲ��ļ�������һ��˼·��
 * 	����˼·������Ҫ�����е����ļ����ȶ�ȡ���ڴ��У�����һ�߶�ȡ���ļ������ݣ�һ��д����Ŀ���ļ�
 * 	����eclipse.exe-0��ʼ����ȡ��һ���ļ����Ϳ�ʼд���� eclipse.exe�У�Ȼ����eclipse.exe-1eclipse.exe-2 eclipse.exe-3 ... ֱ��û���ļ����Զ�
 *
 */
public class Test05 {
    public static void main(String[] args) {
        murgeFile("d:/", "eclipse.exe");
    }
 
    /**
     * �ϲ���˼·�����Ǵ�eclipse.exe-0��ʼ����ȡ��һ���ļ����Ϳ�ʼд���� eclipse.exe�У�ֱ��û���ļ����Զ�
     * @param folder
     *            ��Ҫ�ϲ����ļ������ڵ�Ŀ¼
     * @param fileName
     *            ��Ҫ�ϲ����ļ�������
     * @throws FileNotFoundException
     */
    private static void murgeFile(String folder, String fileName) {
 
        try {
            // �ϲ���Ŀ���ļ�
            File destFile = new File(folder, fileName);
            FileOutputStream fos = new FileOutputStream(destFile);
            int index = 0;
            while (true) {
                //���ļ�
                File eachFile = new File(folder, fileName + "-" + index++);
                //������ļ��������˾ͽ���
                if (!eachFile.exists())
                    break;
 
                //��ȡ���ļ�������
                FileInputStream fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);
                fis.close();
                 
                //�����ļ�������д��ȥ
                fos.write(eachContent);
                fos.flush();
                System.out.printf("�����ļ� %sд����Ŀ���ļ���%n",eachFile);
            }
 
            fos.close();
            System.out.printf("���Ŀ���ļ��Ĵ�С��%,d�ֽ�" , destFile.length());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }	
}
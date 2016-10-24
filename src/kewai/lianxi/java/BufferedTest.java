package kewai.lianxi.java;

import java.io.*;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class BufferedTest {
    public static final String File_Name="e:/ideaIU-2016.1.4.win.zip";
    public static final String Newfile_Name="e:/new.zip";

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            try(InputStream inputStream=new BufferedInputStream(new FileInputStream(File_Name)); OutputStream outputStream=new BufferedOutputStream(new FileOutputStream(Newfile_Name))) {
                int i;
                while ((i=inputStream.read())!=-1){
                    outputStream.write(i);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("total time: " + (System.currentTimeMillis() - start) / 1000 + " seconds.");
    }
}

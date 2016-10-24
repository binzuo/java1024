package kewai.lianxi.java;

import java.io.*;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) {
        File file=new File("e:/test2.txt");
        try(Writer writer=new OutputStreamWriter(new FileOutputStream(file))) {
                writer.write("namodizangpusamohesa");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

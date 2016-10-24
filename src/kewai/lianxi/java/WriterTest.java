package kewai.lianxi.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class WriterTest {
    public static void main(String[] args) {
        File file=new File("test3.txt");

        try(Writer writer=new FileWriter(file)){
            writer.write("hello");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

package kewai.lianxi.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class PrintStreamTest {
    public static void main(String[] args) {

        try(PrintStream printStream=new PrintStream(new File("e:/test4.txt"))){
            printStream.println("namoamituofo");
            printStream.println("1+1="+2);
            printStream.println("南无地藏菩萨摩诃萨");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

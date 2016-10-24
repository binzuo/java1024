package kewai.lianxi.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class ByteArrayTest {
    public static void main(String[] args) {
        String s="NAMODIZANGPUSAMOHESA";
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        int i;
        while ((i=byteArrayInputStream.read())!=-1){
            char c=(char)i;
            byteArrayOutputStream.write(Character.toLowerCase(c));
        }
        String s1=byteArrayOutputStream.toString();
        System.out.println(s1);
    }

}

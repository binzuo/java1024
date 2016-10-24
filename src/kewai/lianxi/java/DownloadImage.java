package kewai.lianxi.java;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2016/10/24 0024.
 */
public class DownloadImage {
    private static int counter;
    public static void down1(String imageURL) throws IOException {
        URL url = new URL(imageURL);
        String fileName = counter + ".jpg";
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:/photo/" + fileName))
        ) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String imgURL= "http://jandan.net/tag/%E5%A4%A9%E6%96%87";
        URL url=new URL(imgURL);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("tankr")) {
                    System.out.println(++counter);
                    down1("http://" + line.substring(line.indexOf("tankr"), line.indexOf(" width") - 1));
                }
            }
            System.out.println(counter);
        }


    }




}

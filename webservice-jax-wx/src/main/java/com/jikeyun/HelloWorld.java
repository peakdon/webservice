package com.jikeyun;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 敦峰
 * @date 2019\10\21 0021 11:57
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        int a = 10;
        int b = 20;
        System.out.println("a+b = " + (a + b));
        System.out.println("周末快乐!");
        System.out.println("周末快乐!");
        System.out.println("周末快乐!");
        System.out.println("周末快乐!");
        System.out.println("周末快乐!");
        //添加变量
        int c = 5;
        FileInputStream fileInputStream = new FileInputStream("E:\\Workspace\\webservice\\webservice-jax-wx\\src\\main\\java\\com\\jikeyun\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte [] bytes=new byte[1024];
        int len;
        while((len=bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}

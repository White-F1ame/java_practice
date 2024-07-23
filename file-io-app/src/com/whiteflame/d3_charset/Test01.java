package com.whiteflame.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //

        //1.编码
        //UTF-8
        System.out.println("--------UTF-8编码---------");
        String s1 = "abc123你好";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));

        //GBK
        System.out.println("--------GBK编码---------");

        String s2 = "abc123你好";
        byte[] bytes2 = s2.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //2.解码
        System.out.println("--------UTF-8编码-UTF-8解码--------");
        String s3 = new String(bytes);//采用平台默认字符集解码
        System.out.println(s3);

        System.out.println("--------GBK编码-GBK解码--------");
        String s4 = new String(bytes2,"GBK");
        System.out.println(s4);

        //错误解码，UTF-8编码，GBK解码
        System.out.println("--------UTF-8编码-GBK解码--------");
        String s5 = new String(bytes,"GBK");
        System.out.println(s5);

        //错误解码，GBK编码，UTF-8解码
        System.out.println("--------GBK编码-UTF-8解码--------");
        String s6 = new String(bytes2);
        System.out.println(s6);

    }
}

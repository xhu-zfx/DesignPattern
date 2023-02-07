package com.panghu.patterns.singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xhu-zfx
 * @email <756867768@qq.com>
 * @date 2022/12/17 19:14
 * @description
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len,"gbk"));
    }
}

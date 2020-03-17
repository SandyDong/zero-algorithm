package com.dong.niuke;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Test04 {
    public static void main(String[] args) throws Exception {
        System.out.println(100/4);
    }


    public static String compress(String str) throws IOException {

        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return out.toString("utf-8");
    }
}

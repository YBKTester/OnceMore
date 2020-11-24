package com.bink;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/23 --3:34 下午
 */
public class WebDownloader {
    /**
     * 下载方法
     *
     * @param url  下载地址
     * @param name 文件名
     */
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出问题了。。。");
        }
    }
}

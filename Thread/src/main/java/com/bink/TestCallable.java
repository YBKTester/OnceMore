package com.bink;

import java.util.concurrent.*;

/**
 * @author yangbingkun
 * @Package com.bink
 * @date 2020/11/24 --10:59 上午
 */
public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable testDownload1 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606124307478&di=34d31bb7598eaf765440b56afa25d0e4&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2Fmonth_1012%2F10120514509c7244b23f4a2fa5.jpg", "1.jpg");
        TestCallable testDownload2 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606124317339&di=46ca6e71f7991f5648fda4a51685ed13&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fforum%2Fw%3D580%2Fsign%3D6e3b71dd9f2f07085f052a08d926b865%2F25d69eec08fa513dcf7a0f4c3c6d55fbb3fbd92e.jpg", "2.jpg");
        TestCallable testDownload3 = new TestCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1606124307477&di=6b7e69382757078ff630f9e50dc77a8c&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201307%2F09%2F20130709095553_LthdX.jpeg", "3.jpg");
        ExecutorService scheduler = Executors.newFixedThreadPool(3);
        Future<Boolean> r1 = scheduler.submit(testDownload1);
        Future<Boolean> r2 = scheduler.submit(testDownload2);
        Future<Boolean> r3 = scheduler.submit(testDownload3);

        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        scheduler.shutdownNow();
    }


}

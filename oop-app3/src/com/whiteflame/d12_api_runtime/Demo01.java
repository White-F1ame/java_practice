package com.whiteflame.d12_api_runtime;

import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        //r.exit(0);

        //获取当前java可用处理器数量
        //System.out.println(r.availableProcessors());

        //System.out.println(r.totalMemory()/1024.0/1024.0);
        //System.out.println(r.freeMemory()/1024.0/1024.0);

        // 启动程序
        Process pro = r.exec("D:\\Tencent\\WeChat\\WeChat.exe");
        //Process pro = r.exec("D:\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
        Thread.sleep(20000);
        pro.destroy();
    }
}

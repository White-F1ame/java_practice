package com.whiteflame.thread.planC;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {

    private String name;

    public CallableImpl(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        StringBuilder sb = new StringBuilder(this.name);
        for (int i = 0; i < 5; i++) {
            sb.append("你好");
            System.out.println(sb.toString());
        }
        String str = sb.toString();
        return str;
    }
}

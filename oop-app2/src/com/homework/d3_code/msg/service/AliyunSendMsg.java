package com.homework.d3_code.msg.service;

public class AliyunSendMsg extends SendMsg{
    @Override
    public void send(String phone, String code) {
        System.out.println("阿里云：" + phone + "发送了验证码" + code);
    }
}

package com.whiteflame.day07.d1;

import java.util.HashSet;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        register(users);
        System.out.println(users);
        register(users);
        System.out.println(users);
        register(users);
        System.out.println(users);
    }

    public static void register(HashSet<User> users){
        int usersSize = users.size();
        while (true) {
            System.out.println("请输入用户名");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();
            System.out.println("请再次输入密码");
            String repassword = sc.nextLine();
            if (password.equals(repassword)){
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                if(users.add(user)){
                    System.out.println("注册成功");
                    return;
                }else {
                    System.out.println("注册失败，账号已存在！");
                    return;
                }
            }else {
                System.out.println("密码有误");
            }
        }
    }
}

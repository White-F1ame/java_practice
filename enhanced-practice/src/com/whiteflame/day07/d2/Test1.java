package com.whiteflame.day07.d2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        List<String> goodsList = new ArrayList<>();
        goodsList.add("小浣熊");
        goodsList.add("香蕉");
        goodsList.add("苹果");
        goodsList.add("口香糖");
        goodsList.add("蟹黄");

        HashMap<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品名称，每行输入一个，以end结束");
            //String in = sc.nextLine();
        //System.out.println(map.get(in));

        //while (true){
        //    String in = sc.nextLine();
        //    if (in.equals("end")) break;
        //    if (map.get(in) == null){
        //        map.put(in,1);
        //    }else {
        //        map.get(in);
        //    }
        //}

    }
}

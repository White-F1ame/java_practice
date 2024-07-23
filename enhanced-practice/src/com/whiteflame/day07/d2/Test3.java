package com.whiteflame.day07.d2;

import com.whiteflame.day07.d1.Student;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //FuckingShop shop1 = new FuckingShop("永辉", "垃圾袋");
        //FuckingShop shop2 = new FuckingShop("扑扑", "垃圾袋");
        //FuckingShop shop3 = new FuckingShop("永辉", "垃圾袋");
        //FuckingShop shop4 = new FuckingShop("永辉", "雪糕");
        HashMap<FuckingShop, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入商店名：（end结束）");
            String store = sc.nextLine();
            System.out.println("输入商品名：（end结束）");
            String goods = sc.nextLine();

            if (store.equals("end") || goods.equals("end")) break;
            FuckingShop fuckingShop = new FuckingShop(store, goods);
            if (map.get(fuckingShop) == null) {
                map.put(fuckingShop, 1);
            } else {
                map.put(fuckingShop, map.get(fuckingShop) + 1);
            }
        }
        map.forEach((k, v) -> System.out.println(k.getStore() + "-" + k.getName() + "--" + v));

    }
}

class FuckingShop {
    private String store;
    private String name;





    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FuckingShop(String store, String name) {
        this.store = store;
        this.name = name;
    }

    public FuckingShop() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuckingShop that = (FuckingShop) o;
        return Objects.equals(store, that.store) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }
}
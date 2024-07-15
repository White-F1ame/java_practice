package com.practice.d18_homework_bank;

//主卡
public class MainCard {
    private  String TYPE = "主卡";
    private double money;//余额
    private String id;//卡号
    private String name;//户主


    //存款
    public void save(double saveNum) {
        System.out.println("用 " + TYPE + " 存" + saveNum);
        double num = saveNum + getMoney();
        setMoney(num);
        System.out.println(toString());
        System.out.println("存款成功，余额为:" + getMoney());
    }

    //取款
    public void get(double getNum) {
        System.out.println("用 " + TYPE + " 取" + getNum);
        if (getNum > getMoney()) {
            System.out.println("余额不足，取款失败");
        } else {
            setMoney(getMoney() - getNum);
            System.out.println(toString());
            System.out.println("取款成功，余额为：" + getMoney());
        }
    }

    @Override
    public String toString() {
        return "卡号为：" + id +
                ", 户主为：" + name;
    }

    public MainCard() {
    }

    public MainCard(double money, String id, String name) {
        this.money = money;
        this.id = id;
        this.name = name;
        System.out.println("初始 银行卡 - " + TYPE + " 余额为：" + getMoney());
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

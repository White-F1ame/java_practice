package com.practice.d18_homework_bank;

/**
 * 2、完成银行卡-副卡的取款方法
 * 副卡额外有透支额度属性(副卡可用主卡中余额，且余额不够，可以透支额度)
 * 副卡重写取款方法（取款时候余额不足要有提示）
 */
public class SecondaryCard extends MainCard {
    private String TYPE = "副卡";
    private double overdraft;

    public SecondaryCard(double money, String id, String name, double overdraft) {
        super(money, id, name);
        this.overdraft = overdraft;
    }

    @Override
    public void get(double getNum) {
        System.out.println("用 " + TYPE + " 取" + getNum);
        if (getNum < getMoney()) {
            setMoney(getMoney() - getNum);
            System.out.println(toString());
            System.out.println("取款成功，余额为：" + getMoney() + "，透支额度：" + getOverdraft());
        } else if (getNum > getMoney() && getNum < getOverdraft()) {
            setMoney(0);
            setOverdraft(getOverdraft() + getMoney() - getNum);
            System.out.println(toString());
            System.out.println("取款成功，余额为：" + getMoney() + "，透支额度：" + getOverdraft());
        } else {
            System.out.println("余额不足，透支额度不足");
        }
    }

    @Override
    public void save(double saveNum) {
        super.save(saveNum);
        System.out.println("透支额度：" + getOverdraft());
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}

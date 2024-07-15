package com.whiteflame.d14_api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondKill {
    public static void main(String[] args) throws ParseException {
        //需求:判断小贾和小皮是否秒杀成功

        String xj = "2023年11月11日 0:1:18";
        String xp = "2023年11月11日 0:10:51";

        System.out.print("小贾");
        secondKill(xj);
        System.out.print("小皮");
        secondKill(xp);
    }
    public static void secondKill(String str) throws ParseException {
        String begin = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date beginD = sdf.parse(begin);
        Date endD = sdf.parse(end);
        long beginT = beginD.getTime();
        long endT = endD.getTime();

        Date userD = sdf.parse(str);
        long userT = userD.getTime();
        if (beginT<userT&&userT<endT){
            System.out.println("秒杀成功");
        }else {
            System.out.println("秒杀失败");
        }
    }

}

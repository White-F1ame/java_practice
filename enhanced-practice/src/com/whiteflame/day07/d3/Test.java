package com.whiteflame.day07.d3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("3726221951dg010416");
        set.add("37222219700211041X");
        set.add("37242219680208044x");
        set.add("354221968020850444");
        set.add("37262319800904575x");
        set.add("3722231af303a99673");
        set.add("3711fdg98603040033");
        set.add("373522198511190042");
        set.add("3755sdf1991112998X");
        String regex = "[1-9]\\d{16}[0-9Xx]";
        Pattern pattern = Pattern.compile(regex);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            Matcher matcher = pattern.matcher(s);
            if (!matcher.find()) {
                it.remove();
            }
        }
        System.out.println("------符合的有------");
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}

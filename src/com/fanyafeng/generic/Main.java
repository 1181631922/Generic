package com.fanyafeng.generic;

import com.fanyafeng.generic.clzss.Container;

/**
 * Created by fanyafeng on 16/7/4.
 */
public class Main {
    public static void main(String[] args) {

        Container container = new Container();
        container.setT("我是键值对的键");
        container.setV(666);
        System.out.println(container.toString());

    }
}

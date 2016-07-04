package com.fanyafeng.generic.usb;

import java.util.Random;

/**
 * Created by fanyafeng on 16/7/4.
 */
public class FruitGenerator implements Generator<String> {

    private static String[] strings = new String[]{"苹果", "香蕉", "梨", "荔枝"};

    @Override
    public String next() {
        Random random = new Random();
        return strings[random.nextInt(4)];
    }
}

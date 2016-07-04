package com.fanyafeng.generic.method;

/**
 * Created by fanyafeng on 16/7/4.
 */
public class Print {
    public static <T> void out(T... args) {
        for (T t : args) {
            System.out.print(t);
        }
    }
}

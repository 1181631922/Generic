package com.fanyafeng.generic.clzss;

/**
 * Created by fanyafeng on 16/7/4.
 */
public class Container<T, V> {
    private T t;
    private V v;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Container{" +
                "t=" + t +
                ", v=" + v +
                '}';
    }
}

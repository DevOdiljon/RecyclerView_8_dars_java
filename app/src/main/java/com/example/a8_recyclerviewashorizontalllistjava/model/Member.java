package com.example.a8_recyclerviewashorizontalllistjava.model;

public class Member {
    String tv_name;
    int iv_image;

    public Member(String tv_name, int iv_image) {
        this.tv_name = tv_name;
        this.iv_image = iv_image;
    }

    public int getIv_image() {
        return iv_image;
    }

    public String getTv_name() {
        return tv_name;
    }
}

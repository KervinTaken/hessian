package com.mooing.hessian;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/25.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name = "kitty";
    private String psw = "nopww";

    public User() {
    }

    public User(String name, String psw) {
        super();
        this.name = name;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

}
package com.zb.demo.sample.dataBase;

import com.zb.demo.sample.IConnect;

public class MySQL implements IConnect {

    private String ip = "localhost";
    public Integer port = 3306;

    public MySQL() {
    }

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void connect() {
        System.out.println(this.ip + ":" + this.port);
    }
}

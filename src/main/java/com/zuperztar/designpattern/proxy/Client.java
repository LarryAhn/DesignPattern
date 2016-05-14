package com.zuperztar.designpattern.proxy;

public class Client {

    public static void main(String[] args) {
        IService proxy = new Proxy();
        System.out.println(proxy.runService());
    }

}

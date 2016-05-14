package com.zuperztar.designpattern.proxy;

public class Proxy implements IService {

    IService service = new Service();

    public String runService() {
        return service.runService();
    }

}

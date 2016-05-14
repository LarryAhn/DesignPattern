package com.zuperztar.designpattern.decorator;

public class Decorator implements IService {

    IService service = new Service();

    public String runService() {
        return "REAL " + service.runService();
    }

}

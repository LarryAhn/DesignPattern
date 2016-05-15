package com.zuperztar.designpattern.factorymethod;

public class CarFactory {

    public static Car getCar(String type) {
        if (type.equals("911"))
            return new Porsche911();
        else if (type.equals("panamera"))
            return new Panamera();
        else if (type.equals("boxter"))
            return new PorscheBoxter();
        else
            return null;
    }

}

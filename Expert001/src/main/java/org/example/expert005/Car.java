package org.example.expert005;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Resource
    Tire tire;
    public String getTireBrand(){
        return "장착된 타이어 : " + tire.getBrand();
    }
}

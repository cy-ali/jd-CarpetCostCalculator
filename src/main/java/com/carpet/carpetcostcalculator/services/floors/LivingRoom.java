package com.carpet.carpetcostcalculator.services.floors;

import com.carpet.carpetcostcalculator.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {

    @Value("${lengthOfLivingRoom}")
    private double length;

    @Value("${widthOfLivingRoom}")
    private double width;

    @Override
    public double getArea() {
        return width * length;
    }
}

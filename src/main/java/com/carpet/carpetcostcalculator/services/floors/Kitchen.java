package com.carpet.carpetcostcalculator.services.floors;

import com.carpet.carpetcostcalculator.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {

    @Value("${radiusOfKitchen}")
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

package com.carpet.carpetcostcalculator.services.floors;

import com.carpet.carpetcostcalculator.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {

    @Value("${sideOfBedroom}")
    private double side;

    @Override
    public double getArea() {
        return (side*side);
    }
}

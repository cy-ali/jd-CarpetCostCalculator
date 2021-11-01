package com.carpet.carpetcostcalculator.services.calculators;

import com.carpet.carpetcostcalculator.enums.City;
import com.carpet.carpetcostcalculator.interfaces.Carpet;
import com.carpet.carpetcostcalculator.services.prices.UnitPrices;
import com.carpet.carpetcostcalculator.services.floors.Bedroom;
import com.carpet.carpetcostcalculator.services.floors.Kitchen;
import com.carpet.carpetcostcalculator.services.floors.LivingRoom;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class CarpetVA implements Carpet {

    private Bedroom bedroom;
    private Kitchen kitchen;
    private LivingRoom livingRoom;
    private UnitPrices unitPrices;

    @Override
    public double getBedroomCarpetPrice(City city) {
        checkCity(city);
        return bedroom.getArea() * unitPrices.getUnitPrice(city);
    }

    @Override
    public double getKitchenCarpetPrice(City city) {
        checkCity(city);
        return kitchen.getArea() * unitPrices.getUnitPrice(city);
    }

    @Override
    public double getLivingRoomCarpetPrice(City city) {
        checkCity(city);
        return livingRoom.getArea() * unitPrices.getUnitPrice(city);
    }

    private void checkCity(City city) {
        if (!(city.equals(City.ARLINGTON) || city.equals(City.FAIRFAX) || city.equals(City.MCLEAN))) {
            throw new IllegalArgumentException("The city is not convenient");
        }
    }
}

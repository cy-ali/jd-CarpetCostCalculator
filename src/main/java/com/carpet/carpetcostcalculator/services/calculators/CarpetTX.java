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
public class CarpetTX implements Carpet {

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
        if (!(city.equals(City.DALLAS) || city.equals(City.AUSTIN) || city.equals(City.SAN_ANTONIO))) {
            throw new IllegalArgumentException("The city is not convenient");
        }
    }
}

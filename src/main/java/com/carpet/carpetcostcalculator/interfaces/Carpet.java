package com.carpet.carpetcostcalculator.interfaces;

import com.carpet.carpetcostcalculator.enums.City;

public interface Carpet {
    double getBedroomCarpetPrice(City city);

    double getKitchenCarpetPrice(City city);

    double getLivingRoomCarpetPrice(City city);
}

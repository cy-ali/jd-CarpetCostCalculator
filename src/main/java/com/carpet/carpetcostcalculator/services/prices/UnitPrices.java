package com.carpet.carpetcostcalculator.services.prices;

import com.carpet.carpetcostcalculator.enums.City;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnitPrices {

    @Value("${DallasPrice}")
    private Double dallasPrice;

    @Value("${AustinPrice}")
    private Double austinPrice;

    @Value("${SanAntonioPrice}")
    private Double sanAntonioPrice;

    @Value("${ArlingtonPrice}")
    private Double arlingtonPrice;

    @Value("${FairfaxPrice}")
    private Double fairfaxPricePrice;

    @Value("${McleanPrice}")
    private Double mcleanPrice;

    public double getUnitPrice(City city) {
        double unitPrice;
        switch (city) {
            case DALLAS:
                unitPrice = dallasPrice;
                break;
            case AUSTIN:
                unitPrice = austinPrice;
                break;
            case SAN_ANTONIO:
                unitPrice = sanAntonioPrice;
                break;
            case ARLINGTON:
                unitPrice = arlingtonPrice;
                break;
            case FAIRFAX:
                unitPrice = fairfaxPricePrice;
                break;
            case MCLEAN:
                unitPrice = mcleanPrice;
                break;
            default:
                throw new IllegalArgumentException("The city is not convenient");
        }
        return unitPrice;
    }
}

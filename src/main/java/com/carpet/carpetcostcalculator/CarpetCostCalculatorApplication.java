package com.carpet.carpetcostcalculator;

import com.carpet.carpetcostcalculator.enums.City;
import com.carpet.carpetcostcalculator.interfaces.Carpet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetCostCalculatorApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(CarpetCostCalculatorApplication.class, args);
        Carpet carpetTX = container.getBean("carpetTX", Carpet.class);
        Carpet carpetVA = container.getBean("carpetVA", Carpet.class);
        System.out.println(carpetTX.getBedroomCarpetPrice(City.AUSTIN));
        System.out.println(carpetTX.getKitchenCarpetPrice(City.SAN_ANTONIO));
        System.out.println(carpetVA.getLivingRoomCarpetPrice(City.MCLEAN));
        System.out.println(carpetTX.getLivingRoomCarpetPrice(City.MCLEAN));

    }

}

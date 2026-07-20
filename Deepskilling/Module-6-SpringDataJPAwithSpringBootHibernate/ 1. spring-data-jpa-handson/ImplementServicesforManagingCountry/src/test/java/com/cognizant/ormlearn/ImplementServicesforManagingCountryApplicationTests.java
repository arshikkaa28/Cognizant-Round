package com.cognizant.ormlearn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootTest
class ImplementServicesforManagingCountryApplicationTests {

    @Autowired
    private CountryService countryService;


    @Test
    void findCountryByCodeTest() {

        Country country = countryService.findCountryByCode("IN");

        if(country != null) {
            System.out.println("Country Name: " + country.getCo_name());
        }
        else {
            System.out.println("Country not found");
        }

    }
}
package com.airbnl.dbcontrollerservice.service.interfaces;


import com.airbnl.dbcontrollerservice.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> getAllCountries();
    Country save(Country country);
    Country getCountryById(long countryId);
}

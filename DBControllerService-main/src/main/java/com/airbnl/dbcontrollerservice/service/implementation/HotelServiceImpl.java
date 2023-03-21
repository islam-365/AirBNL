package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.repositories.HotelRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IHotelService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HotelServiceImpl implements IHotelService {
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getAllHotelsBasedOnTheCountry(long countryId) {
        return hotelRepository.getHotelByCountryId(countryId);
    }

    @Override
    public List<Hotel> getAllHotelsByManagerId(long managerId) {
        return hotelRepository.getHotelByManagerId(managerId);
    }

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelByHotelIdAndManagerId(long hotelId, long managerId) {
        return hotelRepository.getHotelByIdAndManagerId(hotelId, managerId);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
    @Transactional
    @Override
    public Hotel deleteByIdAndManagerID(long hotelId, long managerId) {
        return new Hotel(hotelRepository.deleteHotelByIdAndManagerId(hotelId, managerId),"",managerId,-1);
    }

    @Override
    public Hotel getHotelById(long hotelId) {
        return hotelRepository.findHotelById(hotelId);
    }
}

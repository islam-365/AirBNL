package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.service.interfaces.IHotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    private final IHotelService hotelService;

    public HotelController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/allHotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/allByCountryId")
    public List<Hotel> getAllHotelsBasedOnTheCountry(@RequestParam("countryId") long countryId) {
        return hotelService.getAllHotelsBasedOnTheCountry(countryId);
    }

    @PostMapping("/save")
    public Hotel save(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }

    @GetMapping("/allByManagerID")
    public List<Hotel> getAllByManagerID(@RequestParam("managerId") long managerId) {
        return hotelService.getAllHotelsByManagerId(managerId);
    }

    @GetMapping("/byHotelIdAndManagerId")
    public Hotel getByHotelIdAndManagerId(@RequestParam("hotelId") long hotelId, @RequestParam("managerId") long managerId) {
        return hotelService.getHotelByHotelIdAndManagerId(hotelId, managerId);
    }

    @PutMapping("/update")
    public Hotel update(@RequestBody Hotel hotel) {
        return hotelService.update(hotel);
    }

    @DeleteMapping("/delete")
    public Hotel deleteByIdAndManagerID(@RequestParam("hotelId") long hotelId, @RequestParam("managerId") long managerId) {
        return hotelService.deleteByIdAndManagerID(hotelId, managerId);
    }

    @GetMapping("/getHotelById")
    public Hotel getHotelById(@RequestParam("hotelId") long hotelId) {
        return hotelService.getHotelById(hotelId);
    }
}

package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Reservation;
import com.airbnl.dbcontrollerservice.service.interfaces.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Reservation")
public class ReservationController {
    private final IReservationService reservationService;

    public ReservationController(IReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/getRoomReservationsByUserId")
    public List<Reservation> getRoomReservationsByUserId(@RequestParam("userId") long userId) {
        return reservationService.getRoomReservationsByUserId(userId);
    }

    @PostMapping("/save")
    public Reservation makeReservation(@RequestBody Reservation reservation) {
        return reservationService.makeReservation(reservation);
    }


    @GetMapping("/byHotelIdAndManagerID")
    public List<Reservation> getAllByHotelAndManagerId(@RequestParam("hotelId") long hotelId, @RequestParam("managerId") long managerId) {
        return reservationService.getAllByHotelAndManagerId(hotelId, managerId);
    }

    @GetMapping("/byManagerID")
    public List<Reservation> getAllByManagerID(@RequestParam("managerId") long managerId) {
        return reservationService.getAllByManagerId(managerId);
    }

    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.update(reservation);
    }

    @DeleteMapping("/delete")
    public Reservation delete(@RequestParam("reservationId") long reservationId) {
        return reservationService.delete(reservationId);
    }

    @GetMapping("/reservationIdAndManagerId")
    public Reservation getByReservationIdAndManagerId(@RequestParam("reservationId") long reservationId, @RequestParam("managerId") long managerId) {
        return reservationService.getByReservationIdAndManagerId(reservationId, managerId);
    }
}

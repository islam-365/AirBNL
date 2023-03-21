package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Room;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final IRoomService roomService;

    public RoomController(IRoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/getById")
    Room getById(@RequestParam("roomId") long roomId) {
        return roomService.getById(roomId);
    }

    @GetMapping("/getRoomsByHotelId")
    List<Room> getRoomsByHotelId(@RequestParam("hotelId") long hotelId) {
        return roomService.getRoomsByHotelId(hotelId);
    }

    @GetMapping("/getAllByHotelIdAndManagerId")
    List<Room> getAllByHotelIdAndManagerId(@RequestParam("hotelId") long hotelId, @RequestParam("roomId") long roomId) {
        return roomService.getRoomsByHotelId(hotelId);
    }

    @GetMapping("/getRoomsByCountryAndRoomTypeIds")
    List<Room> getRoomsByCountryAndRoomTypeIds(@RequestParam("countryId") long countryId, @RequestParam("roomTypeId") long roomTypeId) {
        return roomService.getRoomsByCountryAndRoomTypeIds(countryId, roomTypeId);
    }

    @PostMapping("/save")
    Room save(@RequestBody Room room) {
        return roomService.save(room);
    }

    @PostMapping("/update")
    Room update(@RequestBody Room room) {
        return roomService.update(room);
    }

    @DeleteMapping("/delete")
    Room delete(@RequestParam("roomId") long roomId) {
        return roomService.delete(roomId);
    }
}

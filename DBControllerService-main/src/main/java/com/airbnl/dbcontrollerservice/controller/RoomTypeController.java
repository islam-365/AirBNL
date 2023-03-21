package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.RoomType;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoomTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roomType")
public class RoomTypeController {
    private final IRoomTypeService roomTypeService;

    public RoomTypeController(IRoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }

    @GetMapping("/getAllRoomTypes")
    public List<RoomType> getAllRoomTypes() {
        return roomTypeService.getAllRoomTypes();
    }

    @GetMapping("/getAllRoomTypesByHotelID")
    public List<RoomType> getAllRoomTypesByHotelID(@RequestParam("hotelId") int hotelId) {
        return roomTypeService.getAllRoomTypesByHotelID(hotelId);
    }

    @GetMapping("/getRoomTypeById")
    public RoomType getRoomTypeById(@RequestParam("roomTypeId") int roomTypeId) {
        return roomTypeService.getRoomTypeById(roomTypeId);
    }
}

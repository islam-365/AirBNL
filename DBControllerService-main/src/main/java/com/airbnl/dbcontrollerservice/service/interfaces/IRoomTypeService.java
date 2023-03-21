package com.airbnl.dbcontrollerservice.service.interfaces;

import com.airbnl.dbcontrollerservice.model.RoomType;

import java.util.List;

public interface IRoomTypeService {
    List<RoomType> getAllRoomTypes();

    List<RoomType> getAllRoomTypesByHotelID(int hotelIds);

    RoomType getRoomTypeById(int roomTypeId);
}

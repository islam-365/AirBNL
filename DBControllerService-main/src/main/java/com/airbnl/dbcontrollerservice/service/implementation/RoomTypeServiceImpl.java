package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.RoomType;
import com.airbnl.dbcontrollerservice.repositories.RoomTypeRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoomTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeServiceImpl implements IRoomTypeService {
    private final RoomTypeRepository roomTypeRepository;

    public RoomTypeServiceImpl(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    @Override
    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    @Override
    public List<RoomType> getAllRoomTypesByHotelID(int hotelId) {
        return roomTypeRepository.findRoomTypesByHotelId(hotelId);
    }

    @Override
    public RoomType getRoomTypeById(int roomTypeId) {
        return roomTypeRepository.findRoomTypeById(roomTypeId);
    }
}

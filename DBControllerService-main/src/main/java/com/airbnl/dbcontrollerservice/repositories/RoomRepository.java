package com.airbnl.dbcontrollerservice.repositories;

import com.airbnl.dbcontrollerservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Override
    List<Room> findAll();
    Room findRoomById(long roomId);
    List<Room> findAllByHotelId(long hotelId);
    List<Room> findAllByTypeIdAndHotelId(long typeId, long hotelId);

    Integer deleteById(long roomId);
}

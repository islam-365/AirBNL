package com.airbnl.dbcontrollerservice.service.implementation;

import com.airbnl.dbcontrollerservice.model.Hotel;
import com.airbnl.dbcontrollerservice.model.Reservation;
import com.airbnl.dbcontrollerservice.model.Room;
import com.airbnl.dbcontrollerservice.repositories.HotelRepository;
import com.airbnl.dbcontrollerservice.repositories.ReservationRepository;
import com.airbnl.dbcontrollerservice.repositories.RoomRepository;
import com.airbnl.dbcontrollerservice.service.interfaces.IReservationService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {
    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository, RoomRepository roomRepository, HotelRepository hotelRepository) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Reservation> getRoomReservationsByUserId(long userId) {
        return reservationRepository.findAllByUserId(userId);
    }

    @Override
    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    @Override
    public List<Reservation> getAllByHotelAndManagerId(long hotelId, long managerId) {
        List<Room> rooms = roomRepository.findAllByHotelId(hotelId);
        List<Reservation> reservations = new ArrayList<>();

        for (Room room : rooms) {
            reservations.addAll(reservationRepository.findAllByRoomId(room.getId()));
        }
        return reservations;
    }

    @Override
    public Reservation getByReservationIdAndManagerId(long reservationId, long managerId) {
        return reservationRepository.getReservationById(reservationId);
    }

    @Override
    public List<Reservation> getAllByManagerId(long managerId) {
        List<Reservation> reservations = new ArrayList<>();
        for (Hotel hotel : hotelRepository.getHotelByManagerId(managerId)) {
            for (Room room : roomRepository.findAllByHotelId(hotel.getId())) {
                reservations.addAll(reservationRepository.findAllByRoomId(room.getId()));
            }
        }
        return reservations;
    }

    @Override
    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Transactional
    @Override
    public Reservation delete(long reservationId) {
        reservationRepository.deleteById(reservationId);
        return new Reservation();
    }
}

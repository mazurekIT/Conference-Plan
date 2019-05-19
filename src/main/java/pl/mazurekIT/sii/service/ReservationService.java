package pl.mazurekIT.sii.service;

import pl.mazurekIT.sii.model.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation saveReservation(Reservation reservation);

    Reservation getReservationById(Long id);

    Reservation getReservationByCode(String code);

    List<Reservation> getAllReservations();

    Reservation updateReservation(Reservation reservation);

    long countReservations();


}
package com.internship.springbootapplication.service;

import com.internship.springbootapplication.model.entity.Booking;
import com.internship.springbootapplication.model.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookingService {
    Optional<Booking> findById(Integer id);
    List<Booking> findAllBooking();

    void saveBooking(Booking booking);

    void deleteBooking(Booking booking);
}

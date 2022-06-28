package com.internship.springbootapplication.service.Impl;

import com.internship.springbootapplication.model.entity.Booking;
import com.internship.springbootapplication.repository.BookingRepository;
import com.internship.springbootapplication.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookingImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;


    @Override
    public Optional<Booking> findById(Integer id) {
        return bookingRepository.findById(id);
    }

    @Override
    public List<Booking> findAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(Booking booking) {
        bookingRepository.delete(booking);
    }
}

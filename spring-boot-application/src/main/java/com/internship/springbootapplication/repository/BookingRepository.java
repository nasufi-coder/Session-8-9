package com.internship.springbootapplication.repository;

import com.internship.springbootapplication.model.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
}

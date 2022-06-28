package com.internship.springbootapplication.model.entity;

import com.internship.springbootapplication.model.entity.enums.BookingStatus;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "booking_number", length = 20, unique = true, nullable = false)
    private String bookingNumber;

    @Column(name = "booking_start_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bookingStartDate;

    @Column(name = "booking_end_date", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bookingEndDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private BookingStatus status;

    @Column(name = "cost", nullable = false)
    private Double cost;

    @ManyToOne
    @JoinColumn(
            name = "employee_id",
            referencedColumnName = "id"
    )
    private Employee employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingEndDate() {
        return bookingEndDate;
    }

    public void setBookingEndDate(Date bookingEndDate) {
        this.bookingEndDate = bookingEndDate;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}

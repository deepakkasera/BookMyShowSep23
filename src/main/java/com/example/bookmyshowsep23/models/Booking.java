package com.example.bookmyshowsep23.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Booking extends BaseModel{

    @ManyToMany
    private List<ShowSeat> seats;

    // 1 : 1
    // m  : 1
    // m -> 1
    @ManyToOne
    private Show show;

    // 1-> P1, P2, P3 {P1, P2, P3} -> 1:M
    // 1 <- 1
    // 1:M
    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    // 1 -> 1
    // M <- 1
    // M:1
    @ManyToOne
    @CreatedBy
    private User user;
    private int price;
    private Date timeOfBooking;
}

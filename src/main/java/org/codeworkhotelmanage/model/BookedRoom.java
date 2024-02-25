package org.codeworkhotelmanage.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Column(name = "check_In")
    private LocalDate checkInDate;

    @Column(name = "check_Out")
    private LocalDate checkOutDate;

    @Column(name = "Guest_FullName")
    private String guestFullName;

    @Column(name = "Guest_Email")
    private String guestEmail;

    @Column(name = "adults")
    private int NoOfAdults;

    @Column(name = "childrens")
    private int NoOfChildrens;

    @Column(name = "Total_Guests")
    private int totalNoOfGuests;

    @Column(name = "Confirmation_Code")
    private String bookingConformationCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    public void calculateTotalNumberOfGuest(){
        this.totalNoOfGuests=this.NoOfAdults + NoOfChildrens;
    }

    public void setNoOfAdults(int noOfAdults) {
        NoOfAdults = noOfAdults;
        calculateTotalNumberOfGuest();
    }

    public void setNoOfChildrens(int noOfChildrens) {
        NoOfChildrens = noOfChildrens;
        calculateTotalNumberOfGuest();
    }

    public void setBookingConformationCode(String bookingConformationCode) {
        this.bookingConformationCode = bookingConformationCode;
    }
}

package org.codeworkhotelmanage.response;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.codeworkhotelmanage.model.Room;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingResponse {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int NoOfAdults;

    private int NoOfChildrens;

    private int totalNoOfGuests;

    private String bookingConformationCode;


    private RoomResponse room;

    public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate,
                           String bookingConformationCode) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConformationCode = bookingConformationCode;
    }
}

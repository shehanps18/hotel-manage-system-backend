package org.codeworkhotelmanage.response;

import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;

public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private  boolean isBooked = false;
    private List<BookingResponse>bookings;
    private String photo;

    public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomResponse(Long id, String roomType,
                        BigDecimal roomPrice,
                        boolean isBooked,
                        byte[] photoBytes,
                        List<BookingResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = null != photoBytes ? Base64.encodeBase64String(photoBytes) : null;
        this.bookings = bookings;
    }
}

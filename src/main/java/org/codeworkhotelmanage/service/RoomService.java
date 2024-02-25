package org.codeworkhotelmanage.service;

import org.codeworkhotelmanage.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface RoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;
}

package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkOut_RoomIsOccupied_RoomIsNotOccupied() {
        // Arrange
        Room room = new Room(1, 50.0);
        room.checkIn();

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
    }

    // After a check out the room is dirty, so a second check in must be refused
    @Test
    public void checkIn_RoomWasPreviouslyUsed_RoomIsNotOccupied() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();
        room.checkOut();

        // Act
        room.checkIn();

        // Assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_RoomIsOccupied_RoomRemainsDirty() {
        // Arrange
        Room room = new Room(2, 100.0);
        room.checkIn();

        // Act
        room.cleanRoom();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

}
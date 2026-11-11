package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
//sleecte test creat test hit fix once
    @Test
    public void punchOut_NormalShift_HoursIncreased() {
        // Arrange
        Employee employee = new Employee(1, "Isa", "work", 20.00, 0);
        double startTime = 9;
        double endTime = 17;
        double expectedHours = 8;
        employee.punchIn(startTime);

        // Action
        employee.punchOut(endTime);

        // Assert
        //Compares What it should be "expected" to what actaully comes out and test it
        double actualHours = employee.getHoursWorked();
        //check if both values match
        assertEquals(expectedHours, actualHours);
    }

    @Test
    public void punchOut_ExistingHours_TotalHoursIncreased() {
        // Arrange
        Employee employee = new Employee(2, "Isa", "work", 20.00, 20);
        double startTime = 8;
        double endTime = 16;
        double expectedHours = 28;
        employee.punchIn(startTime);

        // Act
        employee.punchOut(endTime);

        // Assert
        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    public void getRegularHours_Under40Hours_ReturnsAllHours() {
        // Arrange
        Employee employee = new Employee(3, "Isa", "work", 25.00, 35);
        double expectedHours = 35;

        // Act
        double actualHours = employee.getRegularHours();

        // Assert
        assertEquals(expectedHours, actualHours);
    }

    @Test
    public void getRegularHours_Over40Hours_Returns40() {
        // Arrange
        Employee employee = new Employee(4, "Isa", "work", 25.00, 50);
        double expectedHours = 40;

        // Act
        double actualHours = employee.getRegularHours();

        // Assert
        assertEquals(expectedHours, actualHours);
    }

    @Test
    public void getOvertimeHours_Over40Hours_ReturnsOvertime() {
        // Arrange
        Employee employee = new Employee(5, "Isa", "work", 20.00, 45);
        double expectedHours = 5;

        // Act
        double actualHours = employee.getOvertimeHours();

        // Assert
        assertEquals(expectedHours, actualHours);
    }

    @Test
    public void getTotalPay_WithOvertime_ReturnsCorrectPay() {
        // Arrange
        Employee employee = new Employee(6, "isa", "work", 20.00, 45);
        double expectedPay = 950.00;

        // Act
        double actualPay = employee.getTotalPay();

        // Assert
        assertEquals(expectedPay, actualPay);
    }
}
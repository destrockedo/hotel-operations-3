package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    //private int energy;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //Void becaus ereturning a field not changing a value
    public void punchIn(double time){
        startTime = time;
    }
    //USes 2 differnt "times"
    public void punchOut(double time){
        hoursWorked = hoursWorked + (time - startTime);
        startTime = 0;

    }
    public void punchTimeCard(double time) {
        if (startTime == 0) {
            startTime = time;
        } else {
            double duration = time - startTime;
            hoursWorked += duration;
            startTime = 0;
        }
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;

        }
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }
    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }
    /*
    OVERLOADING CONTRUCTORS
    // eat
public void eat() {
    this.energy += 20;
    System.out.println("I am eating potatoes! And I added 20 energy!");
}

// eat_int
public void eat(int energyEaten) {
    this.energy += energyEaten;
    System.out.println("I am eating! And I added " + energyEaten + " energy!");
}
     */
    /*
    // Person_String_String_int
public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.energy = 100;
}

// Person_String_String
public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.energy = 100;
}

// Person_int
public Person(int age) {
    this.age = age;
}

// Person_String_int
public Person(String lastName, int age) {
    this.lastName = lastName;
    this.age = age;
}

// Person
public Person(int age, String firstName) {
    this.age = age;
    this.firstName = firstName;
}
     */

    @Override
    public String toString() {
        return employeeId + " | " + name + " | " + department + " | " + payRate + " | " + hoursWorked;
                /*"Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                '}';*/
    }
}

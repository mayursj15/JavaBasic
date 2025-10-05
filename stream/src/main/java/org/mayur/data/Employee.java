package org.mayur.data;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    private String name;
    private int age;
    private double salary;
    private String email;
    private String phoneNumber;
    private LocalDate joiningDate;
    private List<Address> addresses;
    private Department department;
    private String position;
    private Employee manager;
    private boolean isActive;
    private List<String> skills;
    private String employeeId;



}

package com.corejavaproject.serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter@Setter@ToString

public class Employee implements Serializable {

    public static final long serialVersionUID=677643763464L;

    private static String COMPANY_NAME="Infosis";

    private int empId;
    private String empName;
    private double salary;

    private transient String address;

    private long mobileNo;

}

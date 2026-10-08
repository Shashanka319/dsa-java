package com.corejavaproject.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeRuneer {
    public static void main(String[] args) throws Exception {

        String files ="S:\\Xworkz Internship\\oops\\src\\main\\resources.employee.ser";
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Shashank");
        emp.setSalary(50000);
        emp.setAddress("Bangalore");
        emp.setMobileNo(9743873982L);

       ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(files));
       oos.writeObject(emp);

       ObjectInputStream ois=new ObjectInputStream(new FileInputStream(files));
       Employee emp2=(Employee)ois.readObject();
        System.out.println(emp2);

    }
}

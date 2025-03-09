package com.home.employeeCrud.EmployeeCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tectalik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String emp_name;
    private String department_name;
    private String designation_name;

    private String employee_id;


    public Tectalik(){}

    public Tectalik(int emp_id, String emp_name, String department_name, String designation_name, String employee_id) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.department_name = department_name;
        this.designation_name = designation_name;
        this.employee_id= employee_id;
    }
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public String getDepartment_name() {
        return department_name;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    public String getDesignation_name() {
        return designation_name;
    }
    public void setDesignation_name(String designation_name) {
        this.designation_name = designation_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    
    

    

}

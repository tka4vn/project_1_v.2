package com.tkach.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "APPOINTMENT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Appointment {

    @Id
    @Column(name = "APPOINTMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DATE_APP")
    private String dateApp;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
    private Department idAppDep;

    @ManyToOne
    @JoinColumn(name = "POSITION_ID", referencedColumnName = "POSITION_ID")
    private Position idAppPos;

    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
    private Employee idAppEmp;

    public Appointment() {
    }

    public Appointment(String dateApp, Department idAppDep, Position idAppPos, Employee idAppEmp) {
        this.dateApp = dateApp;
        this.idAppDep = idAppDep;
        this.idAppPos = idAppPos;
        this.idAppEmp = idAppEmp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateApp() {
        return dateApp;
    }

    public void setDateApp(String dateApp) {
        this.dateApp = dateApp;
    }

    public Department getIdAppDep() {
        return idAppDep;
    }

    public void setIdAppDep(Department idAppDep) {
        this.idAppDep = idAppDep;
    }

    public Position getIdAppPos() {
        return idAppPos;
    }

    public void setIdAppPos(Position idAppPos) {
        this.idAppPos = idAppPos;
    }

    public Employee getIdAppEmp() {
        return idAppEmp;
    }

    public void setIdAppEmp(Employee idAppEmp) {
        this.idAppEmp = idAppEmp;
    }
}

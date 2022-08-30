package com.tkach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "POSITION")
public class Position {

    @Id
    @Column(name = "POSITION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "idAppPos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Appointment> idPosApp;

    public Position() {
    }

    public Position(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Appointment> getIdPosApp() {
        return idPosApp;
    }

    public void setIdPosApp(Set<Appointment> idPosApp) {
        this.idPosApp = idPosApp;
    }
}

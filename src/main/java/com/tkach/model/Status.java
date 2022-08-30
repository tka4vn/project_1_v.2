package com.tkach.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STATUS")
public class Status {

    @Id
    @Column(name = "STATUS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatus;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "idReqSta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Request> requestList;

    public Status() {
    }

    public Status(String name, Set<Request> requestList) {
        this.name = name;
        this.requestList = requestList;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(Set<Request> requestList) {
        this.requestList = requestList;
    }
}

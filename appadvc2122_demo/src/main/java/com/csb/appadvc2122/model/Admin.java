package com.csb.appadvc2122.model;

import com.csb.appadvc2122.dto.AdminDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String volunteerName;

    @Column(nullable = false)
    private String day;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String time;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Column
    @UpdateTimestamp
    private LocalDateTime dateUpdated;

    public Admin() {}

    public Admin(Long id) { this.id = id; }

    public Admin(AdminDTO adminDTO) {
        this.id = adminDTO.getId();
        this.volunteerName = adminDTO.getVolunteerName();
        this.day = adminDTO.getDay();
        this.location = adminDTO.getLocation();
        this.time = adminDTO.getTime();
    }

    public Long getId() { return id; }

    public String getVolunteerName() {
        return volunteerName;
    }
    public String getDay() {
        return day;
    }
    public String getLocation() { return location; }
    public String getTime() { return time; }


    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

}
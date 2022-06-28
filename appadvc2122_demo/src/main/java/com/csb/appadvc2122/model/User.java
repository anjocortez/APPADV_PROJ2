package com.csb.appadvc2122.model;

import com.csb.appadvc2122.dto.UserDTO;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime dateCreated;

    @Column
    @UpdateTimestamp
    private LocalDateTime dateUpdated;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
//    private Set<Address> addressList;

    public User() {}

    public User(Long id) {
        this.id = id;
    }

    public User(UserDTO userDTO) {
        this.id = userDTO.getId();
        this.fullName = userDTO.getFullName();
        this.userName = userDTO.getUserName();
        this.password = userDTO.getPassword();
        this.email = userDTO.getEmail();
    }

    public Long getId() { return id; }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() { return password; }
    public String getEmail() { return email; }


    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

}
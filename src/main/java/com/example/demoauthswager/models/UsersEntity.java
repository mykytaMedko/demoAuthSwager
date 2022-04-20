package com.example.demoauthswager.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Users", schema = "public", catalog = "TheDesk")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "FirstName")
    private String firstName;
    @Basic
    @Column(name = "FullName")
    private String fullName;
    @Basic
    @Column(name = "PasswordHash")
    private String passwordHash;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "DateRegister")
    private Timestamp dateRegister;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Timestamp dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return id == that.id && Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(fullName, that.fullName) && Objects.equals(passwordHash, that.passwordHash) && Objects.equals(email, that.email) && Objects.equals(dateRegister, that.dateRegister);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, fullName, passwordHash, email, dateRegister);
    }
}

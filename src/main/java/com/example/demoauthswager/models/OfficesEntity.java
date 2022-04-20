package com.example.demoauthswager.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Offices", schema = "public", catalog = "TheDesk")
public class OfficesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Address")
    private String address;
    @Basic
    @Column(name = "Image")
    private String image;
    @Basic
    @Column(name = "CitiesId")
    private int citiesId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCitiesId() {
        return citiesId;
    }

    public void setCitiesId(int citiesId) {
        this.citiesId = citiesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficesEntity that = (OfficesEntity) o;
        return id == that.id && citiesId == that.citiesId && Objects.equals(address, that.address) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, image, citiesId);
    }
}

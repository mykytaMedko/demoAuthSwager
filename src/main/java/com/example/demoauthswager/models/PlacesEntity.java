package com.example.demoauthswager.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Places", schema = "public", catalog = "TheDesk")
public class PlacesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Area")
    private String area;
    @Basic
    @Column(name = "FloorsId")
    private int floorsId;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getFloorsId() {
        return floorsId;
    }

    public void setFloorsId(int floorsId) {
        this.floorsId = floorsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlacesEntity that = (PlacesEntity) o;
        return id == that.id && floorsId == that.floorsId && Objects.equals(name, that.name) && Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, floorsId);
    }
}

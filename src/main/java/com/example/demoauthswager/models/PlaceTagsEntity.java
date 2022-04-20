package com.example.demoauthswager.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PlaceTags", schema = "public", catalog = "TheDesk")
public class PlaceTagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "PlacesId")
    private int placesId;
    @Basic
    @Column(name = "TagsId")
    private int tagsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlacesId() {
        return placesId;
    }

    public void setPlacesId(int placesId) {
        this.placesId = placesId;
    }

    public int getTagsId() {
        return tagsId;
    }

    public void setTagsId(int tagsId) {
        this.tagsId = tagsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceTagsEntity that = (PlaceTagsEntity) o;
        return id == that.id && placesId == that.placesId && tagsId == that.tagsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placesId, tagsId);
    }
}

package com.polytech.polytech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "coordonnees")
public class coordonnees {
    
    @Id
    @GeneratedValue
    private Long id;
    

    private String latitude;
    private String longitude;

    private terrain terrain_id;
    
    coordonnees(Long id, String latitude, String longitude, terrain terrain_id) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.terrain_id = terrain_id;
    }




    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    public terrain getTerrain_id() {
        return terrain_id;
    }


    public void setTerrain_id(terrain terrain_id) {
        this.terrain_id = terrain_id;
    }

    public String toString() {
        return "coordonnees [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", terrain_id="
                + terrain_id + "]";
    }
}

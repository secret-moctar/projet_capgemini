package com.polytech.polytech.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;









@Entity
@Table(name = "terrain")
public class terrain {
    

    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private int quantity;
    private String description;


    terrain(Long id, String nom, int quantity, String description) {
        this.id = id;
        this.nom = nom;
        this.quantity = quantity;
        this.description = description;
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString() {
        return "terrain [id=" + id + ", nom=" + nom + ", quantity=" + quantity + ", description=" + description + "]";
    }


}

package com.polytech.polytech.entity;








import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "reservation")
public class reservation {

    @Id
    @GeneratedValue
    private Long id;
    private utilisateur utilisateur_id;
    private terrain terrain_id;
    private int reservation;
    private Date date_debut;
    private Date date_fin;

    reservation(Long id, utilisateur utilisateur_id, terrain terrain_id, int reservation, Date date_debut,
            Date date_fin) {
        this.id = id;
        this.utilisateur_id = utilisateur_id;
        this.terrain_id = terrain_id;
        this.reservation = reservation;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }
    




    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public utilisateur getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(utilisateur utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public terrain getTerrain_id() {
        return terrain_id;
    }

    public void setTerrain_id(terrain terrain_id) {
        this.terrain_id = terrain_id;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
    
    public String toString() {
        return "Reservation [id=" + id + ", utilisateur_id=" + utilisateur_id + ", terrain_id=" + terrain_id
                + ", reservation=" + reservation + ", date_debut=" + date_debut + ", date_fin=" + date_fin + "]";
    }

}

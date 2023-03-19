package com.basketapp.basket_app.models;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Categorie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     private  Long idCategorie;
     private String label;

     @JsonIgnore
     @OneToMany (mappedBy = "categorie")
     private List<Produit> produits;
     
}


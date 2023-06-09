package com.basketapp.basket_app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long idRole;
    private String role;
}


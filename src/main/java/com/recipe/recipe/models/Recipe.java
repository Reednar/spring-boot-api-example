package com.recipe.recipe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "RECIPE")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Utilisation de GenerationType.IDENTITY pour la génération automatique de l'identifiant
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description", length = Integer.MAX_VALUE)
    private String description;

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Recipe () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.morgage.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pawner_favorite_item")
//@Indexed
public class PawnerFavoriteItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    public PawnerFavoriteItem() {
    }

    public PawnerFavoriteItem(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
